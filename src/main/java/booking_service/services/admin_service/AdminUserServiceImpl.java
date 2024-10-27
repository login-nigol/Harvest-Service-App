package booking_service.services.admin_service;

import booking_service.entities.User;
//import booking_service.enums.UsersRole;
import booking_service.repositories.UserRepository;
import booking_service.modelDTO.user.CreatUserRequestDTO;
import booking_service.modelDTO.user.CreatUserResponseDTO;
import booking_service.exeptions.errorMessage.ErrorMessage;
import booking_service.services.admin_service.interfaces.AdminUserService;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    private final ModelMapper parseUser;
    private final UserRepository userRepository;

    @Autowired
    public AdminUserServiceImpl(UserRepository userRepository, ModelMapper parseUser) {
        this.userRepository = userRepository;
        this.parseUser = parseUser;
    }

    @Override
    public CreatUserResponseDTO create(CreatUserRequestDTO creatUserRequestDTO) {

        if (!userRepository.findAllByUserEmail(creatUserRequestDTO.getUserEmail()).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessage.EMAIL_ALREADY_EXISTS);
        }
        User user = parseUser.map(creatUserRequestDTO, User.class);
//        user.setUserRole(UsersRole.USER);

        User savedUser = userRepository.save(user);

        return parseUser.map(savedUser, CreatUserResponseDTO.class);
    }

//    @Override
//    public User getUser(String userEmail) {
//        if (!userRepository.existsByUserEmail(userEmail)) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessage.ID_NOT_FOUND);
//        }
//        return userRepository.findAllByUserEmail(userEmail).stream().findFirst().get();
//    }

    @Override
    public List<User> getAll() {
        List<User> usersList = userRepository.findAll();

        if (usersList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessage.EMPTY_LIST);
        }
        return usersList;
    }

    @Override
    public User update(User user) {
        User desiredUser = (User) userRepository.findAllByUserEmail(user.getUserEmail());

        if (userRepository.findAllByUserEmail(user.getUserEmail()).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessage.ID_NOT_FOUND);
        }
        return userRepository.save(desiredUser);
    }
}



















