package com.elleithy.job_portal_backend.company.controller;

import com.elleithy.job_portal_backend.company.dto.CompanyDto;
import com.elleithy.job_portal_backend.company.entity.Company;
import com.elleithy.job_portal_backend.company.mapper.CompanyMapper;
import com.elleithy.job_portal_backend.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final ICompanyService companyService;
    private final CompanyMapper companyMapper;

    @GetMapping(version = "1.0")
    public ResponseEntity<List<CompanyDto>> getAllCompanies(){
        List<Company> companies = companyService.getAllCompanies();
        List<CompanyDto> companyDtos = companies.stream().map(companyMapper::toDto).toList();
        return ResponseEntity.ok(companyDtos);
    }
}
