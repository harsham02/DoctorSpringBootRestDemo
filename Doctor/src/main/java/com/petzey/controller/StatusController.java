package com.petzey.controller;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petzey.service.StatusService;

@RestController("/status")
public class StatusController {

	@Autowired
	private StatusService service;

	@GetMapping("/GET/confirmed")
	public ResponseEntity<Serializable> getConfirmed() {
		ResponseEntity<Serializable> response = new ResponseEntity<>(service.CountOfConfirmedAppointment(),
				HttpStatus.OK);
		return response;
	}

	@GetMapping("/GET/closed")
	public ResponseEntity<Serializable> getClosed() {
		ResponseEntity<Serializable> response = new ResponseEntity<>(service.CountOfClosedAppointment(), HttpStatus.OK);
		return response;
	}

	@GetMapping("/GET/cancelled")
	public ResponseEntity<Serializable> getCancelled() {
		ResponseEntity<Serializable> response = new ResponseEntity<>(service.CountOfCancelledAppointment(),
				HttpStatus.OK);
		return response;
	}

	@GetMapping("/GET/total")
	public ResponseEntity<Serializable> get() {
		ResponseEntity<Serializable> response = new ResponseEntity<>(service.CountOfTotalAppointment(), HttpStatus.OK);
		return response;
	}

}
