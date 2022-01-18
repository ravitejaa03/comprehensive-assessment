package com.comprehensive.assisgnment;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.comprehensive.assisgnment.DoctorModel.Doctor;
import com.comprehensive.assisgnment.DoctorRepository.DoctorRepository;

@SpringBootTest
public class DoctorControllerTest {
	
	@Autowired
	private DoctorRepository doctorrepository;
	
	@Test
	 public  void testsave() {
		
		Doctor doctor =new Doctor();
		doctor.setId(1L);
		doctor.setName("ravi teja");
		doctor.setAge(25);
		doctor.setGender("male");
		doctor.setSpecialistfield("heart");
		doctor.setNoofpatientsattended(15);		
	      doctorrepository.save(doctor);
	      Assertions.assertNotNull(doctor.getId());
	      Assertions.assertNotNull(doctor.getName());
	      Assertions.assertNotNull(doctor.getAge());
	      Assertions.assertNotNull(doctor.getGender());
	      Assertions.assertNotNull(doctor.getSpecialistfield());
	      Assertions.assertNotNull(doctor.getNoofpatientsattended());

	     
	}
	@Test
	public void getListofDoctosTest() {
		List<Doctor>doctors=doctorrepository.findAll();
		Assertions.assertNotNull(doctors.size());
	}

}
