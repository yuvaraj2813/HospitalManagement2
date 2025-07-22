package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcedureRequest {

        private Long id;
        private Long patientId;
        private Long leadSurgianId;
        private String procedureName;
        private Date scheduledAt;
        private String notes;


}
