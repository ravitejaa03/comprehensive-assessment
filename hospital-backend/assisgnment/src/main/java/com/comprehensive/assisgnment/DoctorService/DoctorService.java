package com.comprehensive.assisgnment.DoctorService;



import java.util.List;

import com.comprehensive.assisgnment.DoctorModel.Doctor;

public interface DoctorService{
Doctor saveDoctor(Doctor doctor);
List<Doctor> getAllDoctor();
}
