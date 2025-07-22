package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequest {
        private Long id;
        private String name;
        private Date dateOfBirth;
        private String gender;
        private String medicalRecordNumber;

}
