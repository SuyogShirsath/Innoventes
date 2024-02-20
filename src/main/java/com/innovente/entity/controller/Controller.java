package com.innovente.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovente.entity.service.CompanyService;
import com.innoventes.dto.CompanyDto;

@RestController
@RequestMapping("/api/companies")
@Validated
public class Controller {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Long id){
		CompanyDto companyDto = companyService.getCompanyById(id);
		return ResponseEntity.ok(companyDto) ;
	}
	
	
	@GetMapping("/byCode/{CompanyCode}")
	public ResponseEntity<CompanyDto> getCompanyById(@PathVariable String CompanyCode){
		CompanyDto companyDto = companyService.getCompanyByCode(CompanyCode);
		return ResponseEntity.ok(companyDto) ;
	}
	
	
	@PatchMapping("/{id}")
	public ResponseEntity<CompanyDto> partialUpdateCompany(@PathVariable Long id , CompanyDto companyDto){
		CompanyDto companyDto1 = companyService.partialUpdateCompany(id, companyDto);
		return ResponseEntity.ok(companyDto1) ;
	}
	
	
	
	
	

}
