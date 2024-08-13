package com.example.healthcare_system.location;

import com.example.healthcare_system.shift.Shift;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String area;
    private String telephone;
    private String postcode;

    @OneToMany(mappedBy = "location")
    private List<Shift> shifts;
}
