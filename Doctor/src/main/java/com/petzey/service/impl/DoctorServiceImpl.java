package com.petzey.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petzey.dto.DoctorDto;
import com.petzey.entities.Doctor;
import com.petzey.mapper.DoctorMapper;
import com.petzey.repository.DoctorRepository;
import com.petzey.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private DoctorMapper mapper;

	@Override
	public String addNewDoctor(Doctor doctor) {

		doctorRepository.save(doctor);
		return "Successfully Added";
	}

	@Override
	public Doctor findByName(String doctorName) {

		return doctorRepository.getBydoctorName(doctorName);
	}

	@Override
	public List<DoctorDto> getAllDoctors() {

		List<Doctor> listDoctor = doctorRepository.findAll();
		List<DoctorDto> listDoctorDto = new ArrayList<>();
		DoctorDto doctorDto = new DoctorDto();
		for (Doctor doctor : listDoctor) {
			doctorDto = mapper.convertToDto(doctor);
			listDoctorDto.add(doctorDto);
		}
		return listDoctorDto;
	}

}
