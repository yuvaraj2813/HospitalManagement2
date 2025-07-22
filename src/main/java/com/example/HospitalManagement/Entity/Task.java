//package com.example.HospitalManagement.Entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Task {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String description;
//
//    @ManyToOne
//    private Procedure procedure;
//
//
//    public User getAssignedTo() {
//        return assignedTo;
//    }
//
//    public void setAssignedTo(User assignedTo) {
//        this.assignedTo = assignedTo;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Procedure getProcedure() {
//        return procedure;
//    }
//
//    public void setProcedure(Procedure procedure) {
//        this.procedure = procedure;
//    }
//
//    @ManyToOne
//    private User assignedTo; // Nurse, Anesthesiologist, etc.
//
//    // Getters and setters
//}
//
//
//
