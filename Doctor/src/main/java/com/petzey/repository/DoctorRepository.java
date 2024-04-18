package com.petzey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petzey.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	Doctor getBydoctorName(String doctorName);

}
