package com.petzey.service;

import org.springframework.stereotype.Service;

import com.petzey.entities.Status;

@Service
public interface StatusService {

	long CountOfConfirmedAppointment();

	long CountOfClosedAppointment();

	long CountOfCancelledAppointment();

	long saveAppointmentStatus(Status response);

	Long CountOfTotalAppointment();

}
