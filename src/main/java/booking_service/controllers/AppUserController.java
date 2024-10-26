package booking_service.controllers;

import booking_service.entities.AppUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import booking_service.services.admin_service.interfaces.AppAdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Tag(name = "Administrator controller", description = "Управление пользователями и билетами")
public class AppUserController {

    private final AppAdminService userService;

    @Autowired
    public AppUserController(AppAdminService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Создать нового пользователя")
    @PostMapping("/createUser")
    public AppUser createAppUser(@RequestBody AppUser appUser) {
        return userService.create(appUser);
    }

    @Operation(summary = "Список всех пользователей")
    @GetMapping("/getUsers")
    public List<AppUser> getAll() {
        return userService.getAll();
    }


}