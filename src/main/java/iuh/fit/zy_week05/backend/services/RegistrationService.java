package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.dtos.CandidateRegisterDto;
import iuh.fit.zy_week05.backend.dtos.CompanyRegisterDto;
import iuh.fit.zy_week05.backend.entities.Address;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.enums.Role;
import iuh.fit.zy_week05.backend.repositories.AddressRepository;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrationService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private AddressRepository addressRepository;


    public Company registerCompany(CompanyRegisterDto dtoCompanyRegistration) {
        // Tạo đối tượng Address từ DTO
        Address address = Address.builder()
                .street(dtoCompanyRegistration.getStreet())
                .city(dtoCompanyRegistration.getCity())
                .country(dtoCompanyRegistration.getCountry())
                .number(dtoCompanyRegistration.getNumber())
                .zipcode(dtoCompanyRegistration.getZipcode())
                .build();

        // Lưu Address vào cơ sở dữ liệu
        addressRepository.save(address);

        // Tạo đối tượng Company từ DTO sử dụng Builder
        Company company = Company.builder()
                .about(dtoCompanyRegistration.getAbout())
                .email(dtoCompanyRegistration.getEmail())
                .password(dtoCompanyRegistration.getPassword())
                .compName(dtoCompanyRegistration.getCompName())
                .phone(dtoCompanyRegistration.getPhone())
                .webUrl(dtoCompanyRegistration.getWebUrl())
                .address(address) // Gán địa chỉ cho công ty
                .role(Role.COMPANY) // Set role cho công ty
                .build();

        // Lưu công ty vào cơ sở dữ liệu
        return companyRepository.save(company);
    }

    public Candidate registerCandidate(CandidateRegisterDto dto) {
        Address address = Address.builder()
                .street(dto.getStreet())
                .city(dto.getCity())
                .country(dto.getCountry())
                .number(dto.getNumber())
                .zipcode(dto.getZipcode())
                .build();

        // Lưu Address vào cơ sở dữ liệu
        addressRepository.save(address);

        // Tạo đối tượng Candidate từ DTO sử dụng Builder
        Candidate candidate = Candidate.builder()
                .dob(dto.getDob())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .fullName(dto.getFullName())
                .phone(dto.getPhone())
                .role(Role.CANDIDATE) // Set role cho candidate
                .address(address)    // Gán địa chỉ cho candidate
                .build();

        // Lưu Candidate vào cơ sở dữ liệu
        return candidateRepository.save(candidate);

    }
}
