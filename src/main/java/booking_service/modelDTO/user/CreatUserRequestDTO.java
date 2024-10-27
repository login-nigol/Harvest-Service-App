package booking_service.modelDTO.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreatUserRequestDTO {

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhone;
    private String userPassword;
}