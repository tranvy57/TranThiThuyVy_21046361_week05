package iuh.fit.zy_week05.backend.dtos;

import com.neovisionaries.i18n.CountryCode;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateRegisterDto {

    private Long id;
    @NotNull(message = "Ngày sinh không được để trống")
    @Past(message = "Ngày sinh phải là một ngày trong quá khứ")
    private LocalDate dob;

    @NotNull(message = "Email không được để trống")
    @Email(message = "Email phải có định dạng hợp lệ")
    private String email;

    @NotNull(message = "Mật khẩu không được để trống")
    @Size(min = 8, message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String password;

    @NotNull(message = "Họ và tên không được để trống")
    @Size(min = 3, max = 50, message = "Họ và tên phải có độ dài từ 3 đến 50 ký tự")
    private String fullName;

    @NotNull(message = "Số điện thoại không được để trống")
    private String phone;

    // Các trường địa chỉ

    private String street;


    private String city;


    private CountryCode country;

    private String number;

    private String zipcode;
}
