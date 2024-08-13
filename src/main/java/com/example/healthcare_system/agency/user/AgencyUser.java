package com.example.healthcare_system.agency.user;

import com.example.healthcare_system.agency.Agency;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AgencyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String surname;
    private String email;
    private String telephoneNumber;
    private String password;
    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;
}
