package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.entities.Company;

import java.util.List;


public interface CompanyService {
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);

}
