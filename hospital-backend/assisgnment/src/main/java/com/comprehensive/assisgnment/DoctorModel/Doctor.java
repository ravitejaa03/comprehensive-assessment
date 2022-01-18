package com.comprehensive.assisgnment.DoctorModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="doctorinfo")

public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id;
	 @Column(name="name")
	 private String name;
	 @Column(name="age")
	 private int age;
	 @Column(name="gender")
	 private String gender;
	 @Column(name="specialistfield")
	 private String specialistfield;
	 @Column(name="noofpatientsattended")
	 private int noofpatientsattended;
	 
	 public Doctor() {}
	public Doctor(String name, int age, String gender, String specialistfield, int noofpatientsattended) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistfield = specialistfield;
		this.noofpatientsattended = noofpatientsattended;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialistfield() {
		return specialistfield;
	}
	public void setSpecialistfield(String specialistfield) {
		this.specialistfield = specialistfield;
	}
	public int getNoofpatientsattended() {
		return noofpatientsattended;
	}
	public void setNoofpatientsattended(int noofpatientsattended) {
		this.noofpatientsattended = noofpatientsattended;
	}
	 
	 
	

}

