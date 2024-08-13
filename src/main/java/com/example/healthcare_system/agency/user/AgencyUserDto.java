package com.example.healthcare_system.agency.user;

import lombok.Data;

@Data
public class AgencyUserDto {
    private String firstName;
    private String surname;
    private String email;
    private String telephoneNumber;
    private String password;
    private Long agencyId;
}
