package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureNoteRequest {
        private Long id;
        private Long procedureId;
        private Long authorId;
        private String note;
        private Date createdAt;
}
