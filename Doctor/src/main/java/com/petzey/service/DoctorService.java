package com.petzey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.petzey.dto.DoctorDto;
import com.petzey.entities.Doctor;

@Service
public interface DoctorService {

	String addNewDoctor(Doctor doctor);

	Doctor findByName(String doctorName);

	List<DoctorDto> getAllDoctors();
}
