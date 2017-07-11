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
        Calendar start = new GregorianCalendar(2017, 3, 9);
        // 2 ways, pure calendar (or) date with sdf
        System.out.println(start.get(Calendar.MONTH)+1  + " / " + start.get(Calendar.YEAR) + " / "  + start.get(Calendar.DATE));

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
        System.out.println(sdf.format(start.getTime()));

        Calendar end = new GregorianCalendar(2017,5,10);
        System.out.println(sdf.format(end.getTime()));

        // System.out.println(myAllergy.toString());
    }
}
