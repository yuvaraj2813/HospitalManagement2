package com.example.HospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequest {

        private Long id;
        private Long procedureId;
        private String description;
        private String assignedRole;
        private String status;
        private Date dueDate;


}
