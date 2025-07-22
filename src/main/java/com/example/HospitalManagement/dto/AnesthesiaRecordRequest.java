package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnesthesiaRecordRequest {
        private Long id;
        private Long procedureId;
        private Long anesthesiologistId;
        private String anesthesiaType;
        private String notes;
        private Date administeredAt;


}
