package iuh.fit.zy_week05.backend.dtos;

import com.neovisionaries.i18n.CountryCode;
import iuh.fit.zy_week05.backend.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CompanyRegisterDto {

    private String about;

    @NotNull(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Mật khẩu không được để trống")
    @Size(min = 6, message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String password;

    @NotNull(message = "Tên công ty không được để trống")
    @Size(min = 3, max = 100, message = "Tên công ty phải từ 3 đến 100 ký tự")
    private String compName;

    @NotNull(message = "Số điện thoại không được để trống")
    @Size(min = 10, max = 15, message = "Số điện thoại phải có độ dài từ 10 đến 15 ký tự")
    private String phone;

    private String webUrl;

    // Address fields
    @NotNull(message = "Địa chỉ không được để trống")
    private String street;

    @NotNull(message = "Thành phố không được để trống")
    private String city;


    private CountryCode country;

    @NotNull(message = "Số nhà không được để trống")
    private String number;

    @NotNull(message = "Mã bưu điện không được để trống")
    @Size(min = 5, max = 7, message = "Mã bưu điện phải có độ dài từ 5 đến 7 ký tự")
    private String zipcode;

}
