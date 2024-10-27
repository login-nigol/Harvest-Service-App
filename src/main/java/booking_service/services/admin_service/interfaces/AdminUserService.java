package booking_service.services.admin_service.interfaces;

import booking_service.entities.User;
import booking_service.modelDTO.user.CreatUserRequestDTO;
import booking_service.modelDTO.user.CreatUserResponseDTO;

import java.util.List;


public interface AdminUserService {

    CreatUserResponseDTO create(CreatUserRequestDTO creatUserRequestDTO);

//    User getUser(String email);

    List<User> getAll();

    User update(User user);
}