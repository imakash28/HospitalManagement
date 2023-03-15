package com.example.hospital.management.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.hospital.management.dto.PatientDto;

public interface PatientService {

	ResponseEntity<String> admitNewPatient(PatientDto patientDto);

	ResponseEntity<String> dischargePatient(Long patientId);

	ResponseEntity<List> getAllPatientList();

}
