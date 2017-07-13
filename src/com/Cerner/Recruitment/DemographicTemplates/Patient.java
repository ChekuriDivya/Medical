package com.Cerner.Recruitment.DemographicTemplates;

import com.Cerner.Recruitment.AllergyTemplate.Allergy;
import com.Cerner.Recruitment.PrescriptionTemplates.*;
import com.Cerner.Recruitment.TemperatureTemplate.*;
import com.Cerner.Recruitment.DiseaseTemplates.Disease;
import com.Cerner.Recruitment.TestTemplate.Tests;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

/**
 * Created by saibaba on 7/12/17.
 */

enum BloodType{
    O_NEGATIVE, O_POSITIVE,
    A_POSITIVE, A_NEGATIVE,
}
public class Patient extends Person{

    ArrayList<Allergy> allergyArrayList = new ArrayList<>();
    ArrayList<Prescription> prescriptionArraList = new ArrayList<>();
    ArrayList<Temperature> temperatureArrayList = new ArrayList<>();
    ArrayList<Doctors> doctorsArrayList = new ArrayList<>();
    ArrayList<Disease> diseasesArrayList = new ArrayList<>();
    float bloodPressure;
    float heartBeat;
    ArrayList<Tests> testsArrayList = new ArrayList<>();
    BloodType bloodType;

    Patient(){}
    Patient(String firstName, String lastName, int age, Calendar dob,
            TreeMap<String, ArrayList<String>> phone, Address address, String ssn,
            Height height, float weight, Gender gender, boolean organDonar,
            ArrayList<Allergy> allergyArrayList, ArrayList<Prescription> prescriptionArraList,
            ArrayList<Temperature> temperatureArrayList, ArrayList<Doctors> doctorsArrayList,
            ArrayList<Disease> diseasesArrayList, float bloodPressure, float heartBeat, ArrayList<Tests> testsArrayList, BloodType bloodType){
        super(firstName,lastName,age,dob,phone,address,ssn,height,weight,gender,organDonar);
        this.allergyArrayList = allergyArrayList;
        this.prescriptionArraList = prescriptionArraList;
        this.temperatureArrayList = temperatureArrayList;
        this.doctorsArrayList = doctorsArrayList;
        this.diseasesArrayList = diseasesArrayList;
        this.bloodPressure = bloodPressure;
        this.heartBeat = heartBeat;
        this.testsArrayList = testsArrayList;
        this.bloodType = bloodType;
    }

    public ArrayList<Allergy> getAllergyArrayList() {
        return allergyArrayList;
    }

    public void setAllergyArrayList(ArrayList<Allergy> allergyArrayList) {
        this.allergyArrayList = allergyArrayList;
    }

    public ArrayList<Prescription> getPrescriptionArraList() {
        return prescriptionArraList;
    }

    public void setPrescriptionArraList(ArrayList<Prescription> prescriptionArraList) {
        this.prescriptionArraList = prescriptionArraList;
    }

    public ArrayList<Temperature> getTemperatureArrayList() {
        return temperatureArrayList;
    }

    public void setTemperatureArrayList(ArrayList<Temperature> temperatureArrayList) {
        this.temperatureArrayList = temperatureArrayList;
    }

    public ArrayList<Doctors> getDoctorsArrayList() {
        return doctorsArrayList;
    }

    public void setDoctorsArrayList(ArrayList<Doctors> doctorsArrayList) {
        this.doctorsArrayList = doctorsArrayList;
    }

    public ArrayList<Disease> getDiseasesArrayList() {
        return diseasesArrayList;
    }

    public void setDiseasesArrayList(ArrayList<Disease> diseasesArrayList) {
        this.diseasesArrayList = diseasesArrayList;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(float heartBeat) {
        this.heartBeat = heartBeat;
    }

    public ArrayList<Tests> getTestsArrayList() {
        return testsArrayList;
    }

    public void setTestsArrayList(ArrayList<Tests> testsArrayList) {
        this.testsArrayList = testsArrayList;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }
}
