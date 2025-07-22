//package com.example.HospitalManagement.service;
//
//import com.example.HospitalManagement.Entity.Procedure;
//import com.example.HospitalManagement.Entity.Task;
//import com.example.HospitalManagement.Entity.User;
//import com.example.HospitalManagement.dto.ProcedureCreateRequest;
//import com.example.HospitalManagement.dto.TaskCreateRequest;
//import com.example.HospitalManagement.Repository.ProcedureRepository;
//import com.example.HospitalManagement.Repository.TaskRepository;
//import com.example.HospitalManagement.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LeadSurgeonService {
//
//    @Autowired
//    private ProcedureRepository procedureRepository;
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private TaskRepository taskRepository;
//
//    // Create Procedure and assign team
//    public Procedure createProcedure(ProcedureCreateRequest req) {
//        Procedure procedure = new Procedure();
//        procedure.setProcedureName(req.getProcedureName());
//        procedure.setScheduledAt(req.getScheduledAt());
//        procedure.setNotes(req.getNotes());
//
//        procedure.setLeadSurgeon(userRepository.findById(req.getLeadSurgeonId()).orElseThrow());
//        procedure.setLeadNurse(userRepository.findById(req.getLeadNurseId()).orElseThrow());
//        procedure.setAnesthesiologist(userRepository.findById(req.getAnesthesiologistId()).orElseThrow());
//
//        return procedureRepository.save(procedure);
//    }
//
//    // Define Task and assign to a user
//    public Task defineTask(Long procedureId, TaskCreateRequest request) {
//        Task task = new Task();
//        task.setDescription(request.getDescription());
//        task.setProcedure(procedureRepository.findById(procedureId).orElseThrow());
//        if (request.getAssignedToUserId() != null) {
//            task.setAssignedTo(userRepository.findById(request.getAssignedToUserId()).orElseThrow());
//        }
//        return taskRepository.save(task);
//    }
//}
