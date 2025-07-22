//package com.example.HospitalManagement.security;
//
//
//import com.example.HospitalManagement.Entity.Procedure;
//import com.example.HospitalManagement.Repository.ProcedureRepository;
//import com.example.HospitalManagement.dto.ProcedureRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.sql.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class SurgicalCaseService {
//
//    @Autowired
//    private ProcedureRepository procedureRepository;
//
//    public List<ProcedureRequest> getAllSurgicalCases() {
//        return procedureRepository.findAll()
//                .stream()
//                .map(this::toRequest)
//                .collect(Collectors.toList());
//    }
//    private ProcedureRequest toRequest(Procedure procedure) {
//        ProcedureRequest req = new ProcedureRequest();
//        req.setId(procedure.getId());
//        req.setPatientId(
//                procedure.getPatient() != null ? procedure.getPatient().getId() : null
//        );
//        req.setLeadSurgianId(
//                procedure.getLeadSurgeon() != null ? procedure.getLeadSurgeon().getId() : null
//        );
//        req.setProcedureName(procedure.getProcedureName());
//        req.setScheduledAt((Date) procedure.getScheduledAt());
//        req.setNotes(procedure.getNotes());
//        return req;
//    }
//
//}
