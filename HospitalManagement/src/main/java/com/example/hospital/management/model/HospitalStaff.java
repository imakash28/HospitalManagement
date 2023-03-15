package com.example.hospital.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HospitalStaff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hospitalStaffId;
	
	private String email;
	
	private String password;

	/**
	 * @return the hospitalStaffId
	 */
	public Long getHospitalStaffId() {
		return hospitalStaffId;
	}

	/**
	 * @param hospitalStaffId the hospitalStaffId to set
	 */
	public void setHospitalStaffId(Long hospitalStaffId) {
		this.hospitalStaffId = hospitalStaffId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
