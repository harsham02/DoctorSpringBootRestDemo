package com.petzey.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petzey.dto.AppointmentDto;
import com.petzey.entities.Appointment;
import com.petzey.entities.Doctor;
import com.petzey.mapper.DoctorMapper;
import com.petzey.repository.AppointmentRepository;
import com.petzey.repository.DoctorRepository;
import com.petzey.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private DoctorMapper mapper;

	@Override
	public String addNewAppointment(Appointment appointment) {
		Doctor doctor = doctorRepository.getBydoctorName(appointment.getDoctorName());
		if (doctor != null) {
			doctor.getAppointments().add(appointment);
			doctorRepository.save(doctor);
			return "Add SuccessFully";
		} else {
			return "something went wrong";
		}

	}

	@Override
	public long getCountOfStatus(String status) {
		return appointmentRepository.getByappointmentStatus(status).size();
	}

	@Override
	public int getAppointmentTotalCount() {
		return appointmentRepository.findAll().size();
	}

	@Override
	public List<AppointmentDto> getAllAppointment() {
		List<Appointment> listAppointment = appointmentRepository.findAll();
		List<AppointmentDto> listAppointDto = new ArrayList<>();
		AppointmentDto appointmentDto = new AppointmentDto();
		for (Appointment appointment : listAppointment) {
			appointmentDto = mapper.converttoDto(appointment);
			listAppointDto.add(appointmentDto);
		}
		return listAppointDto;
	}

}
