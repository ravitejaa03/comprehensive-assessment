package com.comprehensive.assisgnment.DoctorRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comprehensive.assisgnment.DoctorModel.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
