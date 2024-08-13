package com.example.healthcare_system.agency.user;

import com.example.healthcare_system.agency.Agency;
import com.example.healthcare_system.agency.AgencyRepository;
import com.example.healthcare_system.shift.Shift;
import com.example.healthcare_system.shift.ShiftDto;
import com.example.healthcare_system.shift.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyUserService {
    private final ShiftRepository shiftRepository;
    private final AgencyRepository agencyRepository;

    @Autowired
    public AgencyUserService(ShiftRepository shiftRepository, AgencyRepository agencyRepository) {
        this.shiftRepository = shiftRepository;
        this.agencyRepository = agencyRepository;
    }

    public void addNewShift(ShiftDto shiftDto){
        Agency agency = agencyRepository.findById(shiftDto.getAgencyId())
                .orElseThrow(() -> new RuntimeException("Agency not found"));

        Shift shift = new Shift();
        shift.setAgency(agency);
        shift.setBand(shiftDto.getBand());
        shift.setStartTime(shiftDto.getStartTime());
        shift.setEndTime(shiftDto.getEndTime());
        shift.setShiftDate(shiftDto.getShiftDate());
        shiftRepository.save(shift);
    }
}
