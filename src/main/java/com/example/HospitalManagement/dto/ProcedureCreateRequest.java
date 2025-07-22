package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcedureCreateRequest {
    private String procedureName;
    private Date scheduledAt;
    private String notes;
    private Long leadSurgeonId;
    private Long leadNurseId;
    private Long anesthesiologistId;

    // Getters and setters
}
