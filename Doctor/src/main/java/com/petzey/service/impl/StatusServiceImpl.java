package com.petzey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.petzey.entities.Status;
import com.petzey.mapper.StatusMapper;
import com.petzey.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

//	@Autowired
//	private StatusRepository StatusRepository;

	@Autowired
	StatusMapper mapper;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public long CountOfConfirmedAppointment() {
		Long status = restTemplate.getForObject("http://localhost:8077/GET/countstatus/confirmed", Long.class);
		return status;
	}

	@Override
	public long CountOfClosedAppointment() {
		Long status = restTemplate.getForObject("http://localhost:8077/GET/countstatus/closed", Long.class);
		return status;
	}

	@Override
	public long CountOfCancelledAppointment() {
		Long status = restTemplate.getForObject("http://localhost:8077/GET/countstatus/cancelled", Long.class);
		return status;
	}

	@Override
	public long saveAppointmentStatus(Status status) {

		return status.getId();
	}

	@Override
	public Long CountOfTotalAppointment() {

		Long status = restTemplate.getForObject("http://localhost:8077/GET/totalnumber", Long.class);
		return status;
	}

}
