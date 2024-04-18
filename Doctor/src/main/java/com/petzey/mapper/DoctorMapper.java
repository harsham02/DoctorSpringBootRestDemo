package com.petzey.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.petzey.dto.AppointmentDto;
import com.petzey.dto.DoctorDto;
import com.petzey.entities.Appointment;
import com.petzey.entities.Doctor;

@Mapper
public interface DoctorMapper {

	@Mapping(source = "appointment.pet", target = "pet")
	@Mapping(source = "appointment.petParent", target = "petParent")
	@Mapping(source = "appointment.appointmentDate", target = "appointmentDate")
	public AppointmentDto converttoDto(Appointment appointment);

	@Mapping(source = "doctor.doctorName", target = "doctorName")
	@Mapping(source = "doctor.mobile", target = "mobile")
	@Mapping(source = "doctor.speciality", target = "speciality")
	public DoctorDto convertToDto(Doctor doctor);

}
