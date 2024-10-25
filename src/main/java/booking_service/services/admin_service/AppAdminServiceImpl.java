package booking_service.services.admin_service;

import booking_service.entities.AppUser;
import booking_service.repositories.AppUserRepository;
import booking_service.exeptions.errorMessage.ErrorMessage;

import booking_service.services.admin_service.interfaces.AppAdminService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AppAdminServiceImpl implements AppAdminService {

    private final AppUserRepository userRepository;

    @Autowired
    public AppAdminServiceImpl(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUser create(AppUser appUser) {

        if (userRepository.findAllByEmail(appUser.getEmail()).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, ErrorMessage.EMAIL_ALREADY_EXISTS);
        }
        return userRepository.save(appUser);
    }

    @Override
    public List<AppUser> getAll() {
        List<AppUser> usersList = userRepository.findAll();

        if (usersList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorMessage.EMPTY_LIST);
        }
        return usersList;
    }
}