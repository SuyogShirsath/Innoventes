package com.innovente.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovente.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	 Company findByCompanyCode(String companyCode);

}
