package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import iuh.fit.zy_week05.backend.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findCompanyById(id);
    }
}
