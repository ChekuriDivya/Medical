package com.Cerner.Recruitment.AllergyTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by saibaba on 7/10/17.
 */
enum BodyLocation{
    EAR, MOUTH, ARMPIT
}

// Date, Calendar predefined classes ->
// Calendar better than Date because, Date has deprecated functions

public class Allergy {
    private String allergyName;
    private Severity severity;
    private Calendar startDate;
    private Calendar endDate;
    private BodyLocation loc;

    public Allergy(){} // empty argument constructor
    public Allergy(String allergyName, Severity severity, Calendar startDate, Calendar endDate, BodyLocation loc){ // argument const
        this.allergyName = allergyName;
        this.severity = severity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.loc = loc;
    }

    public Allergy(String allergyName, Severity severity, BodyLocation loc) {
        this.allergyName = allergyName;
        this.severity = severity;
        this.loc = loc;
    }

    public BodyLocation getLoc() {
        return loc;
    }

    public void setLoc(BodyLocation loc) {
        this.loc = loc;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM:/dd:yyyy");
        return  "allergyName= '" + allergyName + '\'' +
                ", severity= " + severity +
                ", startDate= " + sdf.format(startDate.getTime()) +
                ", endDate= " + sdf.format(endDate.getTime());
    }
}
