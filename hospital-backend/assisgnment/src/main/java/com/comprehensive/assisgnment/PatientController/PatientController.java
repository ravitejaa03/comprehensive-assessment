package com.comprehensive.assisgnment.PatientController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comprehensive.assisgnment.PatientModel.Patient;
import com.comprehensive.assisgnment.PatientService.PatientService;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {
@Autowired
   private PatientService patientservice;


public PatientController(PatientService patientservice) {
	super();
	this.patientservice = patientservice;
}

@PostMapping("/add")
public Patient savePatient(@RequestBody Patient patient) {
	return patientservice.savePatient(patient);
}
@GetMapping("/patient")
public List<Patient>getAllPatient(){
	return patientservice.getAllPatient();
}


}
