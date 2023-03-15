package com.example.hospital.management.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.hospital.management.dao.HospitalDao;
import com.example.hospital.management.dto.HospitalDto;
import com.example.hospital.management.model.HospitalStaff;
import com.example.hospital.management.service.HospitalService;


@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalDao hospitalDao;
	
	
	@Override
	public ResponseEntity<String> addHospiatlStaff(HospitalDto hospitalDto) {
		
		Optional<HospitalStaff> isEmailExist=hospitalDao.findByEmail(hospitalDto.getEmail());
		
		if(!isEmailExist.isPresent()) {

			HospitalStaff hospiatl = new HospitalStaff();
			
			hospiatl.setEmail(hospitalDto.getEmail());
			hospiatl.setPassword(hospitalDto.getPassword());
			hospitalDao.save(hospiatl);
			  return new ResponseEntity<>(
				      "200 Successfully Registered", HttpStatus.OK);
		}
		else {
			 return new ResponseEntity<>(
				      "205 Email Already Registered", HttpStatus.NOT_FOUND);
		}
		
	}


	@Override
	public ResponseEntity<String> login(String email, String password) {
		Optional<HospitalStaff> isStaffExist=hospitalDao.findByEmailAndPassword(email,password);
		if(isStaffExist.isPresent()) {
			return new ResponseEntity<>(
				      "200 You are logged in successfully", HttpStatus.OK);
		}
		else {
			 return new ResponseEntity<>(
				      "205 Invalid credentials", HttpStatus.NOT_FOUND);
		}
	}

}
