package com.comprehensive.assisgnment.PatientServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comprehensive.assisgnment.PatientModel.Patient;
import com.comprehensive.assisgnment.PatientRepository.PatientRepository;
import com.comprehensive.assisgnment.PatientService.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	
	private PatientRepository patientrepository;
	
	
	public PatientServiceImpl(PatientRepository patientrepository) {
		super();
		this.patientrepository = patientrepository;
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return patientrepository.findAll();
	}

	@Override
	public Patient savePatient(Patient patient) {
		
		return patientrepository.save(patient);
	}

}
