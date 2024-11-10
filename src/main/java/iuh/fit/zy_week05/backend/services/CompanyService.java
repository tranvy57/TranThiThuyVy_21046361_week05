package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.entities.Company;
import org.springframework.data.domain.Page;

import java.util.List;


public interface CompanyService {
    Page<Company> getAllCompanies(int pageNo, int pageSize);
    Company getCompanyById(Long id);
    Company getCompanyByEmail(String email);
}
