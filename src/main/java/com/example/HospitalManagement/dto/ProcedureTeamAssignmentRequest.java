package com.example.HospitalManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureTeamAssignmentRequest {
        private Long id;
        private Long procedureId;
        private Long userId;
        private String roleInTeam;
}
