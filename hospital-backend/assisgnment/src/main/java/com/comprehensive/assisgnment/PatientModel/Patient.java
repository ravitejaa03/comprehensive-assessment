package com.comprehensive.assisgnment.PatientModel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="patientinfo")
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="dateofvisited")
	private Date dateofvisited;
	@Column(name="doctorvisited")
	private String doctorvisited;
	public Patient() {}
	public Patient(String name, Date dateofvisited, String doctorvisited) {
		super();
		this.name = name;
		this.dateofvisited = dateofvisited;
		this.doctorvisited = doctorvisited;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofvisited() {
		return dateofvisited;
	}
	public void setDateofvisited(Date dateofvisited) {
		this.dateofvisited = dateofvisited;
	}
	public String getDoctorvisited() {
		return doctorvisited;
	}
	public void setDoctorvisited(String doctorvisited) {
		this.doctorvisited = doctorvisited;
	}


}
