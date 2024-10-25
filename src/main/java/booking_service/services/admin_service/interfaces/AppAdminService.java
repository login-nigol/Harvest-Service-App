package booking_service.services.admin_service.interfaces;

import booking_service.entities.AppUser;

import java.util.List;


public interface AppAdminService {

    AppUser create(AppUser appUser);

    List<AppUser> getAll();
}