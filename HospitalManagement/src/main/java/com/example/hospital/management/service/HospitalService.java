package com.example.hospital.management.service;

import org.springframework.http.ResponseEntity;

import com.example.hospital.management.dto.HospitalDto;

import io.swagger.models.Response;

public interface HospitalService {

	ResponseEntity<String> addHospiatlStaff(HospitalDto hospitalDto);


	ResponseEntity<String> login(String email, String password);

}
