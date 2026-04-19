package com.elleithy.job_portal_backend.company.mapper;

import com.elleithy.job_portal_backend.company.dto.CompanyDto;
import com.elleithy.job_portal_backend.company.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public CompanyDto toDto(Company company) {
        return new CompanyDto(
                company.getId(),
                company.getName(),
                company.getLogo(),
                company.getIndustry(),
                company.getSize(),
                company.getRating(),
                company.getLocations(),
                company.getFounded(),
                company.getDescription(),
                company.getEmployees(),
                company.getWebsite(),
                company.getCreatedAt()
        );
    }

    public Company toEntity(CompanyDto dto) {
        Company company = new Company();
        company.setName(dto.name());
        company.setLogo(dto.logo());
        company.setIndustry(dto.industry());
        company.setSize(dto.size());
        company.setRating(dto.rating());
        company.setLocations(dto.locations());
        company.setFounded(dto.founded());
        company.setDescription(dto.description());
        company.setEmployees(dto.employees());
        company.setWebsite(dto.website());

        return company;
    }
}