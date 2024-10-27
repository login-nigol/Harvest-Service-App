package booking_service.controllers;

import booking_service.entities.User;
import booking_service.modelDTO.user.CreatUserRequestDTO;
import booking_service.modelDTO.user.CreatUserResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import booking_service.services.admin_service.interfaces.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping
@Tag(name = "Administrator controller", description = "Управление сервисом бронирования билетов")
public class AdminUserController {

    private final AdminUserService userService;

    @Autowired
    public AdminUserController(AdminUserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Создать нового пользователя")
    @PostMapping("/User/CreateUser")
    public ResponseEntity<CreatUserResponseDTO> createUser(@RequestBody CreatUserRequestDTO creatUserRequestDTO) {
        return ResponseEntity.ok(userService.create(creatUserRequestDTO));
    }

//    @Operation(summary = "Найти пользователя по ID")
//    @GetMapping("/User/GetUser")
//    public ResponseEntity<User> getUser(@RequestParam Long id) {
//        return ResponseEntity.ok(user);
//    }

    @Operation(summary = "Список всех пользователей")
    @GetMapping("/User/GetAllUsers")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @Operation(summary = "Обновить пользователя")
    @PutMapping("/User/UpdateUser")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }
}














