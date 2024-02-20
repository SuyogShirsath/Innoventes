package com.innovente.entity.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovente.entity.Company;
import com.innovente.entity.exception.resourceNotFoundException;
import com.innovente.entity.repository.CompanyRepository;
import com.innoventes.dto.CompanyDto;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	public CompanyDto getCompanyById(Long id) {
		
		Company company = companyRepository.findById(id).orElseThrow(() -> new resourceNotFoundException("Company not found with id:"+id, null, id ));
		
		CompanyDto companyDto = modelMapper.map(company, CompanyDto.class);
		return companyDto;	
	}
	
	public CompanyDto getCompanyByCode(String companyCode) {
		
		Company findByCompanyCode = companyRepository.findByCompanyCode(companyCode);
		return modelMapper.map(findByCompanyCode, CompanyDto.class);	
	}
	
	
	
	public CompanyDto partialUpdateCompany(Long id , CompanyDto companyDto) {
		
		Company company = companyRepository.findById(id).orElseThrow(() -> new resourceNotFoundException("Company not found with id:"+id, null, id ));

		company.setCompanyName(companyDto.getCompanyName());
		company.setEmail(companyDto.getEmail());
		company.setStrength(companyDto.getStrength());
		company.setWebSiteURL(companyDto.getWebSiteURL());
		company.setCompanyCode(companyDto.getCompanyCode());
		
		companyRepository.save(company);
		
		return modelMapper.map(company, CompanyDto.class);	
	}
	
	
	
	

}
