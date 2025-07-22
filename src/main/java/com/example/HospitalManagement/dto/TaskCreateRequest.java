package com.example.HospitalManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskCreateRequest {
    private String description;
    private Long assignedToUserId;

    // Getters and setters
}
