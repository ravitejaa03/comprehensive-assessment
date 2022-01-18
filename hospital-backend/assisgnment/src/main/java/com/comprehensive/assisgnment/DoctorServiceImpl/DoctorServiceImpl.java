package com.comprehensive.assisgnment.DoctorServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensive.assisgnment.DoctorModel.Doctor;
import com.comprehensive.assisgnment.DoctorRepository.DoctorRepository;
import com.comprehensive.assisgnment.DoctorService.DoctorService;



@Service
public class DoctorServiceImpl implements DoctorService{

 


	@Autowired
	private DoctorRepository doctorrepository;
	
	
	
	public DoctorServiceImpl(DoctorRepository doctorrepository) {
		super();
		this.doctorrepository = doctorrepository;
	}
	@Override
	public List<Doctor>getAllDoctor(){
		return doctorrepository.findAll();
	}
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorrepository.save(doctor);}
}
	


