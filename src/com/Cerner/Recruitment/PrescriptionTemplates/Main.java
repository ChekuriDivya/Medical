package com.Cerner.Recruitment.PrescriptionTemplates;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by saibaba on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        Date currentDate = new Date();
        start.setTime(currentDate);
        Calendar stop = Calendar.getInstance();
        Date afterXDays = new Date();
        stop.setTime(afterXDays);
        stop.add(GregorianCalendar.DAY_OF_MONTH, 2); // use for 2 months
        String dosage = "25mg";
        ArrayList<Medicines> meds = new ArrayList<>();
        meds.add(new Medicines());
        Prescription newPrescription = new Prescription("Divya",meds);
    }
}
