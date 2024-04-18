package com.petzey.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;

	private String doctorName;
	private String mobile;
	private String npiNo;
	private String email;
	private String speciality;
	private String clinic;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Appoinements")
	private List<Appointment> appointments;
}
