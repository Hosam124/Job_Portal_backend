package com.elleithy.job_portal_backend.company.service.imp;

import com.elleithy.job_portal_backend.company.entity.Company;
import com.elleithy.job_portal_backend.company.repository.CompanyRepository;
import com.elleithy.job_portal_backend.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImp implements ICompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
