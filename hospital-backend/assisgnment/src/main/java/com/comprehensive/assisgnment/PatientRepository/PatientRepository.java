package com.comprehensive.assisgnment.PatientRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comprehensive.assisgnment.PatientModel.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
