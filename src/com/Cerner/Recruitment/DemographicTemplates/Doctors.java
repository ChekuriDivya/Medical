package com.Cerner.Recruitment.DemographicTemplates;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

/**
 * Created by saibaba on 7/12/17.
 */
public class Doctors extends Person{
    ArrayList<String> qualification;

    Doctors(){}
    Doctors(String firstName, String lastName, int age, Calendar dob,
            TreeMap<String, ArrayList<String>> phone, Address address, String ssn,
            Height height, float weight, Gender gender, boolean organDonar,ArrayList<String> qualification){
        super(firstName,lastName,age,dob,phone,address,ssn,height,weight,gender,organDonar);
        this.qualification = qualification;
    }
}