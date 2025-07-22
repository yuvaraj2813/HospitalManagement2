//package com.example.HospitalManagement.controller;
//
//
//import com.example.HospitalManagement.Entity.Procedure;
//import com.example.HospitalManagement.Entity.Task;
//import com.example.HospitalManagement.service.LeadSurgeonService;
//import com.example.HospitalManagement.dto.ProcedureCreateRequest;
//import com.example.HospitalManagement.dto.TaskCreateRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/leadsurgeon")
//public class LeadSurgeonController {
//
//    @Autowired
//    private LeadSurgeonService leadSurgeonService;
//
//    // Create a new procedure and assign team
//    @PostMapping("/procedures")
//    public ResponseEntity<Procedure> createProcedure(
//            @RequestBody ProcedureCreateRequest req) {
//        Procedure procedure = leadSurgeonService.createProcedure(req);
//        return ResponseEntity.ok(procedure);
//    }
//
//    // Define a new task for a procedure and assign to a team member
//    @PostMapping("/procedures/{procedureId}/tasks")
//    public ResponseEntity<Task> defineTask(
//            @PathVariable Long procedureId,
//            @RequestBody TaskCreateRequest request) {
//        Task task = leadSurgeonService.defineTask(procedureId, request);
//        return ResponseEntity.ok(task);
//    }
//}
