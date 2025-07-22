//package com.example.HospitalManagement.controller;
//
//import com.example.HospitalManagement.dto.ProcedureRequest;
//import com.example.HospitalManagement.security.SurgicalCaseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/cmo")
//public class ChiefMedicalOfficerController {
//
//    @Autowired
//    private SurgicalCaseService surgicalCaseService;
//
//    @GetMapping("/surgical-cases")
//    @PreAuthorize("hasAuthority('chiefmedicalofficer')")
//    public ResponseEntity<List<ProcedureRequest>> viewSurgicalCases() {
//        List<ProcedureRequest> cases = surgicalCaseService.getAllSurgicalCases();
//        return ResponseEntity.ok(cases);
//    }
//}
