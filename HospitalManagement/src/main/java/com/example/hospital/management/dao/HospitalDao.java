package com.example.hospital.management.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.management.model.HospitalStaff;

public interface HospitalDao extends JpaRepository<HospitalStaff, Long> {

	Optional<HospitalStaff> findByEmail(String email);

	Optional<HospitalStaff> findByEmailAndPassword(String email, String password);

}
