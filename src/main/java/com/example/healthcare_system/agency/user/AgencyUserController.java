package com.example.healthcare_system.agency.user;

import com.example.healthcare_system.shift.ShiftDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agency/user")
public class AgencyUserController {
    private final AgencyUserService agencyUserService;

    @Autowired
    public AgencyUserController(AgencyUserService agencyUserService) {
        this.agencyUserService = agencyUserService;
    }

    @PostMapping("/shift")
    public void addNewShift(@RequestBody ShiftDto shiftDto) {
        agencyUserService.addNewShift(shiftDto);
    }
}
