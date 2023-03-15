package com.example.hospital.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.management.dto.HospitalDto;
import com.example.hospital.management.dto.PatientDto;
import com.example.hospital.management.service.HospitalService;
import com.example.hospital.management.service.PatientService;

import io.swagger.annotations.ApiOperation;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@ApiOperation(value = "API for admit new patient")
	@PostMapping("/admit-new-patient")
	public ResponseEntity<String> admitNewPatient(@RequestBody PatientDto patientDto) {
		return patientService.admitNewPatient(patientDto);
	}
	
	@ApiOperation(value = "API for discharge patient")
	@PostMapping("/discharge-patient")
	public ResponseEntity<String> dischargePatient(@RequestHeader Long patientId) {
		return patientService.dischargePatient(patientId);
	}
	
	@ApiOperation(value = "API for get all patient")
	@GetMapping("/get-all-patient-list")
	public ResponseEntity<List> getAllPatientList() {
		return patientService.getAllPatientList();
	}
}
