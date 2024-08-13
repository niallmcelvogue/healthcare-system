package com.example.healthcare_system.shift;
import lombok.Data;
import java.util.Date;

@Data
public class ShiftDto {

    private Long agencyId; // The ID of the agency associated with this shift
    private int band;     // The band of the shift
    private Date startTime; // The start time of the shift
    private Date endTime;   // The end time of the shift
    private Date shiftDate; // The date of the shift

}

