package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyControllers {
    @Autowired
    CompanyService companyService;
    @RequestMapping("")
    public ModelAndView companies(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("companies");

        List<Company> companies = companyService.getAllCompanies();
        modelAndView.addObject("companies", companies);

        return modelAndView;
    }
}
