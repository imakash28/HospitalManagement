package com.example.hospital.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.management.model.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {

}
