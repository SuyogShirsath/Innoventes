package com.innovente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.innoventes.customanno.EvenNumberOrZero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "company_name")
	private String companyName;
	
	private String email;
	
	@EvenNumberOrZero(message = "Strength should be an even number or Zero")
	private Integer strength;
	
	private String webSiteURL;
	
	@Column(name = "company_code")
	private String companyCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Company(Long id, String companyName, String email, Integer strength, String webSiteURL, String companyCode) {
		this.id = id;
		this.companyName = companyName;
		this.email = email;
		this.strength = strength;
		this.webSiteURL = webSiteURL;
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", email=" + email + ", strength=" + strength
				+ ", webSiteURL=" + webSiteURL + ", companyCode=" + companyCode + "]";
	}
	

}
