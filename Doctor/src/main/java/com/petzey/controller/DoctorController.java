package com.petzey.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petzey.entities.Doctor;
import com.petzey.service.DoctorService;

@RestController("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/addnew")
	public ResponseEntity<?> post(@RequestBody Doctor doctor) {
		return new ResponseEntity<>(doctorService.addNewDoctor(doctor), HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(doctorService.getAllDoctors(), HttpStatus.OK);
	}

	@GetMapping("/get/byName")
	public ResponseEntity<?> get(@PathParam(value = "doctorName") String doctorName) {
		return new ResponseEntity<>(doctorService.findByName(doctorName), HttpStatus.OK);
	}
}
