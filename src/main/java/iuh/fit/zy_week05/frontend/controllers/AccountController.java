package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.services.CompanyService;
import iuh.fit.zy_week05.backend.services.JobService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/account")
public class AccountController {
//    @Autowired
//    AccountService accountService;
//    @Autowired
//    JobService jobService;
//
//    @Autowired
//    CompanyService companyService;
//    @RequestMapping("login")
//    public ModelAndView login(@RequestParam("username") Optional<String> username,
//                              @RequestParam("password") Optional<String> password, HttpSession session){
//
//        Account account = accountService.login(username.get(), password.get());
//        ModelAndView modelAndView = new ModelAndView();
//        if(account == null){
//
//           modelAndView.addObject("error", "Sai tên đăng nhập hoặc mật khẩu");
//           modelAndView.setViewName("index");
//        }else{
//            Company company = companyService.getCompanyByEmail(username.get());
//            session.setAttribute("loggedInUser", company);
//            modelAndView.setViewName("redirect:/companies");
//
//
//            int currentPage = 1;
//            int pageSize = 6;
//            Page<Job> jobPage = jobService.getAllJobs(currentPage - 1, pageSize);
//            modelAndView.addObject("jobPage", jobPage);
//
//            int totalPages = jobPage.getTotalPages();
//            if (totalPages > 0) {
//                List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
//                        .boxed()
//                        .collect(Collectors.toList());
//                modelAndView.addObject("pageNumbers", pageNumbers);
//            }
//
//        }
//        return modelAndView;
//    }
}
