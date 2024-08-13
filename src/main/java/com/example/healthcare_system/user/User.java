package com.example.healthcare_system.user;

import com.example.healthcare_system.agency.Agency;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;
    private String email;
    private String telephoneNumber;
    private int band;
    private String password;

    @OneToOne
    @JoinColumn(name = "agency_id", nullable = false)
    private Agency agency;
}
