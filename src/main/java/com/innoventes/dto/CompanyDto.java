package com.innoventes.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
	
	
	@NotEmpty(message = "Company name is Mandatory")
	@Size(min = 5 , message = "Should be at least 5 characters of length")
	private String companyName;
	
	@NotEmpty(message = "Email is mandatory")
	@Email(message = "Invalid email format")
	private String email;
	
	private Integer strength;
	
	private String webSiteURL;
	
	@Pattern(regexp = "[a-zA-Z]{2}[0-9]{2}[0-9a-zA-Z]", message = "Invalid company code format")
	@Column(unique = true , name = "company_code")
	private String companyCode;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getWebSiteURL() {
		return webSiteURL;
	}

	public void setWebSiteURL(String webSiteURL) {
		this.webSiteURL = webSiteURL;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public CompanyDto(
			@NotEmpty(message = "Company name is Mandatory") @Size(min = 5, message = "Should be at least 5 characters of length") String companyName,
			@NotEmpty(message = "Email is mandatory") @Email(message = "Invalid email format") String email,
			Integer strength, String webSiteURL,
			@Pattern(regexp = "[a-zA-Z]{2}[0-9]{2}[0-9a-zA-Z]", message = "Invalid company code format") String companyCode) {
		this.companyName = companyName;
		this.email = email;
		this.strength = strength;
		this.webSiteURL = webSiteURL;
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		return "CompanyDto [companyName=" + companyName + ", email=" + email + ", strength=" + strength
				+ ", webSiteURL=" + webSiteURL + ", companyCode=" + companyCode + "]";
	}
	

	
	
}
