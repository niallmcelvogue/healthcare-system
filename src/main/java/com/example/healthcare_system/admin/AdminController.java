package com.example.healthcare_system.admin;

import com.example.healthcare_system.agency.Agency;
import com.example.healthcare_system.agency.user.AgencyUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/agency")
    public void addNewAgency(@RequestBody Agency agency) {
        adminService.addNewAgency(agency);
    }

    @PostMapping("/agency/user")
    public void addNewAgencyUser(@RequestBody AgencyUserDto agencyUserDto) {
        adminService.addNewAgencyUser(agencyUserDto);
    }
}
