package com.comprehensive.assisgnment.DoctorController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comprehensive.assisgnment.DoctorModel.Doctor;
import com.comprehensive.assisgnment.DoctorService.DoctorService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class DoctorController {
@Autowired
   private DoctorService doctorservice;
public DoctorController(DoctorService doctorservice) {
	super();
	this.doctorservice=doctorservice;
}

@PostMapping("/add")
public Doctor saveDoctor(@RequestBody Doctor doctor) {
	return doctorservice.saveDoctor(doctor);
}
@GetMapping("/doctor")
public List<Doctor>getAllDoctor(){
	return doctorservice.getAllDoctor();
}


}


