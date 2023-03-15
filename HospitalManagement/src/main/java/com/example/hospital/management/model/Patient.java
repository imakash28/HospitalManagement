package com.example.hospital.management.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.example.hospital.management.enums.PatientStatus;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	
	private String patientName;
	
	private String age;
	
	private String roomNumber;
	
	private String doctorName;
	
	@CreationTimestamp
	private Date admitDate;
	
	private BigDecimal expenses;
	
	@Enumerated(EnumType.STRING)
	private PatientStatus patientStatus;

	/**
	 * @return the patientId
	 */
	public Long getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the name
	 */


	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the admitDate
	 */
	public Date getAdmitDate() {
		return admitDate;
	}

	/**
	 * @param admitDate the admitDate to set
	 */
	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

	/**
	 * @return the expenses
	 */
	public BigDecimal getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(BigDecimal expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the patientStatus
	 */
	public PatientStatus getPatientStatus() {
		return patientStatus;
	}

	/**
	 * @param patientStatus the patientStatus to set
	 */
	public void setPatientStatus(PatientStatus patientStatus) {
		this.patientStatus = patientStatus;
	}
	
	
}
