package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.services.CompanyService;
import iuh.fit.zy_week05.backend.services.JobService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/companies")
public class CompanyControllers {
    @Autowired
    CompanyService companyService;
    @Autowired
    JobService jobService;

    @RequestMapping("")
    public ModelAndView companyDetail(@RequestParam("page") Optional<Integer> page,
                                      @RequestParam("size") Optional<Integer> size){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("trangchu");


        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);
        Page<Job> jobPage = jobService.getAllJobs(currentPage - 1, pageSize);
        modelAndView.addObject("jobPage", jobPage);

        int totalPages = jobPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }

        return modelAndView;
    }

    @RequestMapping("/getListJob")
    public ModelAndView showJobByCompany( @RequestParam("page") Optional<Integer> page,
                                      @RequestParam("size") Optional<Integer> size, HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("company/show-jobs-by-company");

        Company company = (Company) session.getAttribute("loggedInUser");
        Long id = company.getId();

        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);
        Page<Job> jobPage = jobService.getJobsByCompanyId(id, currentPage - 1, pageSize);
        modelAndView.addObject("jobPage", jobPage);

        int totalPages = jobPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }

        return modelAndView;
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createJob(@ModelAttribute Job job){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("job/create-job");
        return modelAndView;
    }
}
