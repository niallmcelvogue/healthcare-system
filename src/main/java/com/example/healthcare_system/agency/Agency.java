package com.example.healthcare_system.agency;

import com.example.healthcare_system.agency.user.AgencyUser;
import com.example.healthcare_system.shift.Shift;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "agency")
    private List<Shift> shifts;
    @OneToMany(mappedBy = "agency")
    private List<AgencyUser> admins;
}
