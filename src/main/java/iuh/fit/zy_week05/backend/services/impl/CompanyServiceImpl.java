package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import iuh.fit.zy_week05.backend.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Page<Company> getAllCompanies(int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        return companyRepository.findAll(pageRequest);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findCompanyById(id);
    }

}
