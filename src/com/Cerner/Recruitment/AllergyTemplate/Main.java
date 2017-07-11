package com.Cerner.Recruitment.AllergyTemplate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by saibaba on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2017, 4, 9);
        System.out.println(start.get(Calendar.YEAR) + " / " + start.get(Calendar.MONTH) + " / " + start.get(Calendar.DATE));
        SimpleDateFormat sdf = new SimpleDateFormat("MM:dd:yyyy");
        System.out.println(sdf.format(start.getTime()));
        Calendar end = new GregorianCalendar(2017,5,10);
        System.out.println(sdf.format(start.getTime()));
        Allergy myAllergy = new Allergy("Rash",Severity.HIGH,start,end);
        System.out.println(myAllergy.toString());
    }
}
