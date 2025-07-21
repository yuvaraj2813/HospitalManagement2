package com.example.HospitalManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pm")
public class ProjectManagerController {

        @GetMapping("/dashboard")
        public String adminDashboard() {
            return "Project Manager dashboard";
        }
}
