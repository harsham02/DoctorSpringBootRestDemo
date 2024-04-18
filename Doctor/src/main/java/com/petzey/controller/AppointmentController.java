package com.petzey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petzey.entities.Appointment;
import com.petzey.service.AppointmentService;

@RestController("/Appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@PostMapping("/POST/addnew")
	public ResponseEntity<?> post(@RequestBody Appointment appointment) {
		return new ResponseEntity<>(appointmentService.addNewAppointment(appointment), HttpStatus.OK);
	}

	@GetMapping("/GET/countstatus/confirmed")
	public ResponseEntity<?> get() {
		String status = "Confirmed";
		return new ResponseEntity<>(appointmentService.getCountOfStatus(status), HttpStatus.OK);

	}

	@GetMapping("/GET/countstatus/cancelled")
	public ResponseEntity<?> getCancelled() {
		String status = "Cancelled";
		return new ResponseEntity<>(appointmentService.getCountOfStatus(status), HttpStatus.OK);

	}

	@GetMapping("/GET/countstatus/closed")
	public ResponseEntity<?> getClosed() {
		String status = "Closed";
		return new ResponseEntity<>(appointmentService.getCountOfStatus(status), HttpStatus.OK);

	}

	@GetMapping("/GET/totalnumber")
	public ResponseEntity<?> getTotal() {
		return new ResponseEntity<>(appointmentService.getAppointmentTotalCount(), HttpStatus.OK);

	}

	@GetMapping("/GET/all")
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(appointmentService.getAllAppointment(), HttpStatus.OK);
	}

}
