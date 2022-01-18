package com.comprehensive.assisgnment;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.comprehensive.assisgnment.PatientModel.Patient;
import com.comprehensive.assisgnment.PatientRepository.PatientRepository;

@SpringBootTest
public class PatientControllerTest {

	@Autowired 
	private PatientRepository patientrepository;
	
	
	@Test
	public  void testsave() {
		Patient patient= new Patient();
		patient.setId(1L);
		patient.setName("manjula");
		patient.setDoctorvisited("raviteja");
	    patient.setDateofvisited(null);
	    patientrepository.save(patient);
	    Assertions.assertNotNull(patient.getId());
	    Assertions.assertNotNull(patient.getName());
	    Assertions.assertNotNull(patient.getDoctorvisited());
	    Assertions.assertNull(patient.getDateofvisited());
	}
	
	@Test
	public void testListPatient() {
		List<Patient> Patient = patientrepository.findAll();
               Assertions.assertNotNull(Patient.size());
               }}