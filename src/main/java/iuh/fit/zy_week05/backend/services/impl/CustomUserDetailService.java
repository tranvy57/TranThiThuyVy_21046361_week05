package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.CustomUserDetails;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Company company = companyRepository.findByEmail(username);
        if (company != null) {
            return new CustomUserDetails(company.getEmail(), company.getPassword(), company.getRole());
        }

        Candidate candidate = candidateRepository.findByEmail(username);
        if (candidate != null) {
            return new CustomUserDetails(candidate.getEmail(), candidate.getPassword(), candidate.getRole());
        }

        return null;
    }
}
