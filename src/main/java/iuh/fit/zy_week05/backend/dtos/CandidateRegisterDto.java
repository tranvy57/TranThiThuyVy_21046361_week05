package iuh.fit.zy_week05.backend.dtos;

import com.neovisionaries.i18n.CountryCode;
import iuh.fit.zy_week05.backend.enums.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CandidateRegisterDto {
    private Long id;
    private LocalDate dob;
    private String email;
    private String password;
    private String fullName;
    private String phone;

    // Address fields
    private String street;
    private String city;
    private CountryCode country;
    private String number;
    private String zipcode;

}
