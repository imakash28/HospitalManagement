package com.example.hospital.management.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.hospital.management.dao.PatientDao;
import com.example.hospital.management.dto.PatientDto;
import com.example.hospital.management.enums.PatientStatus;
import com.example.hospital.management.model.Patient;
import com.example.hospital.management.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;
	
	@Override
	public ResponseEntity<String> admitNewPatient(PatientDto patientDto) {

		Patient patient = new Patient();
		
		patient.setAdmitDate(new Date());
		patient.setAge(patientDto.getAge());
		patient.setDoctorName(patientDto.getDoctorName());
		patient.setExpenses(patientDto.getExpenses());
		patient.setPatientName(patientDto.getPatientName());
		patient.setPatientStatus(PatientStatus.ADMITTED);
		patient.setRoomNumber(patientDto.getRoomNumber());
		patientDao.save(patient);
		  return new ResponseEntity<>(
			      "200 Successfully Registered", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> dischargePatient(Long patientId) {
 	
		
		Optional<Patient> patientExist = patientDao.findById(patientId);
		if(patientExist.isPresent()) {
			
			patientExist.get().setPatientStatus(PatientStatus.DISCHARGED);
			patientDao.save(patientExist.get());
			  return new ResponseEntity<>(
				      "200 Success", HttpStatus.OK);
			
		}
		else {
			 return new ResponseEntity<>(
				      "205 Patient Details Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ResponseEntity<List> getAllPatientList() {
		List<Patient> allPatientList = patientDao.findAll();
		
		if(!allPatientList.isEmpty()) {
			return new ResponseEntity<List>(
				      allPatientList, HttpStatus.OK);
		}
		return new ResponseEntity<>(
			     HttpStatus.NOT_FOUND);
	}

	
	
}
