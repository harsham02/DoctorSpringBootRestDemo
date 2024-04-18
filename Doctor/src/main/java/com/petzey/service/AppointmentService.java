package com.petzey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.petzey.dto.AppointmentDto;
import com.petzey.entities.Appointment;

@Service
public interface AppointmentService {

	String addNewAppointment(Appointment appointment);

	long getCountOfStatus(String status);

	int getAppointmentTotalCount();

	List<AppointmentDto> getAllAppointment();
}
