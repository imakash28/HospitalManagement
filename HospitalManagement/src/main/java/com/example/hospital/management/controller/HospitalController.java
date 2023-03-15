package com.example.hospital.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import com.example.hospital.management.dto.HospitalDto;
import com.example.hospital.management.service.HospitalService;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;

@RestController
public class HospitalController {

	
	@Autowired
	private HospitalService hospitalService;
	
	@ApiOperation(value = "API for signUp")
	@PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody HospitalDto hospitalDto) {
		return hospitalService.addHospiatlStaff(hospitalDto);
	}
	
	@ApiOperation(value = "API for login")
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
		return hospitalService.login(email,password);
	}

}
