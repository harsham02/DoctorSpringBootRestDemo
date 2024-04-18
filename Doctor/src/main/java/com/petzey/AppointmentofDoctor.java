package com.petzey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.petzey.mapper.DoctorMapper;
import com.petzey.mapper.DoctorMapperImpl;
import com.petzey.mapper.StatusMapperImpl;

@SpringBootApplication
public class AppointmentofDoctor {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentofDoctor.class, args);
	}

	@Bean
	public DoctorMapper getDoctorMapper() {
		return new DoctorMapperImpl();
	}

	@Bean
	public com.petzey.mapper.StatusMapperImpl mapper() {
		return new StatusMapperImpl();
	}

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

}
