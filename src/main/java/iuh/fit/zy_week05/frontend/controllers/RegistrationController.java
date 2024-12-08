package iuh.fit.zy_week05.frontend.controllers;


import com.neovisionaries.i18n.CountryCode;
import iuh.fit.zy_week05.backend.dtos.CandidateRegisterDto;
import iuh.fit.zy_week05.backend.dtos.CompanyRegisterDto;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.CustomUserDetails;
import iuh.fit.zy_week05.backend.services.CompanyService;
import iuh.fit.zy_week05.backend.services.RegistrationService;
import iuh.fit.zy_week05.backend.services.impl.CustomUserDetailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private CustomUserDetailService customUserDetailService;


    @GetMapping()
    public String showRegisterPage() {
        return "register"; // Chuyển đến trang "register.html"
    }

    @GetMapping("/company")
    public String showCompanyRegistrationForm(Model model) {
        model.addAttribute("companyRegisterDto", new CompanyRegisterDto());
        model.addAttribute("countries", CountryCode.values());
        model.addAttribute("success", false);
        return "company/registerCompany";  // Chuyển đến form đăng ký công ty
    }

    @PostMapping("/company")
    public String registerCompany(Model model, @Valid @ModelAttribute CompanyRegisterDto companyRegisterDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "company/registerCompany"; // Trả về trang đăng ký với lỗi
        }
        UserDetails user = customUserDetailService.loadUserByUsername(companyRegisterDto.getEmail());
        System.out.println("UserDetails"+ user);
        if (user != null) {
            bindingResult.addError(
                    new FieldError("companyRegisterDto", "email", "Gmail này đã được đăng ký")
            );
            return "company/registerCompany";
        }

        try {
            Company company = registrationService.registerCompany(companyRegisterDto);
            System.out.println("Company đã tạo: "+ company.toString());
            model.addAttribute("companyRegisterDto", new CompanyRegisterDto());
            model.addAttribute("success", true);
        } catch (Exception e) {
            bindingResult.addError(
                    new FieldError("companyRegisterDto", "about", e.getMessage())
            );
        }
        return "company/registerCompany";
    }

    @GetMapping("/candidate")
    public String showCandidateRegistrationForm(Model model) {
        model.addAttribute("candidateRegisterDto", new CandidateRegisterDto());
        return "candidate/registerCandidate";  // Chuyển đến form đăng ký ứng viên
    }

    @PostMapping("/candidate")
    public String registerCandidate(Model model, @Valid @ModelAttribute CandidateRegisterDto candidateRegisterDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "candidate/registerCandidate"; // Trả về trang đăng ký với lỗi
        }
        UserDetails user = customUserDetailService.loadUserByUsername(candidateRegisterDto.getEmail());
        System.out.println("UserDetails"+ user);
        if (user != null) {
            bindingResult.addError(
                    new FieldError("companyRegisterDto", "email", "Gmail này đã được đăng ký")
            );
            return "candidate/registerCandidate";
        }

        try {
            Candidate candidate = registrationService.registerCandidate(candidateRegisterDto);

            model.addAttribute("candidateRegisterDto", new CandidateRegisterDto());
            model.addAttribute("success", true);
        } catch (Exception e) {
            bindingResult.addError(
                    new FieldError("candidateRegisterDto", "fullName", e.getMessage())
            );
        }
        return "candidate/registerCandidate";  // Sau khi đăng ký thành công, chuyển đến trang login
    }
}

