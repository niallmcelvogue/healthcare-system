package com.example.healthcare_system.admin;

import com.example.healthcare_system.agency.Agency;
import com.example.healthcare_system.agency.AgencyRepository;
import com.example.healthcare_system.agency.user.AgencyUser;
import com.example.healthcare_system.agency.user.AgencyUserDto;
import com.example.healthcare_system.agency.user.AgencyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AgencyRepository agencyRepository;
    private final AgencyUserRepository agencyUserRepository;

    @Autowired
    public AdminService(AgencyRepository agencyRepository, AgencyUserRepository agencyUserRepository) {
        this.agencyRepository = agencyRepository;
        this.agencyUserRepository = agencyUserRepository;

    }

    public void addNewAgency(Agency agency) {
        agencyRepository.save(agency);
    }

    public void addNewAgencyUser(AgencyUserDto userDto) {
        Agency agency = agencyRepository.findById(userDto.getAgencyId())
                .orElseThrow(() -> new RuntimeException("Agency not found"));
        AgencyUser agencyUser = new AgencyUser();
        agencyUser.setAgency(agency);
        agencyUser.setFirstName(userDto.getFirstName());
        agencyUser.setSurname(userDto.getSurname());
        agencyUser.setEmail(userDto.getEmail());
        agencyUser.setPassword(userDto.getPassword());
        agencyUser.setTelephoneNumber(userDto.getTelephoneNumber());

        agencyUserRepository.save(agencyUser);
    }
}
