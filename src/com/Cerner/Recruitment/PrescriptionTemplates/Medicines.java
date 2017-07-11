package com.Cerner.Recruitment.PrescriptionTemplates;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by saibaba on 7/10/17.
 */
class Medicines {
    String Name;
    Calendar start;
    Calendar stop;
    Calendar timings;
    Calendar manifacturedDate;
    Calendar ExpiryDate;
    ArrayList<String> sideEffects;
    String manfacturingCompany;
    Timings times;
    ArrayList<String> chemicals;

    Medicines(){}
    Medicines(String name, Calendar start, Calendar stop, Calendar timings, Calendar manifacturedDate, Calendar expiryDate, ArrayList<String> sideEffects, String manfacturingCompany, Timings times, ArrayList<String> chemicals) {
        Name = name;
        this.start = start;
        this.stop = stop;
        this.timings = timings;
        this.manifacturedDate = manifacturedDate;
        ExpiryDate = expiryDate;
        this.sideEffects = sideEffects;
        this.manfacturingCompany = manfacturingCompany;
        this.times = times;
        this.chemicals = chemicals;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getStop() {
        return stop;
    }

    public void setStop(Calendar stop) {
        this.stop = stop;
    }

    public Calendar getTimings() {
        return timings;
    }

    public void setTimings(Calendar timings) {
        this.timings = timings;
    }

    public Calendar getManifacturedDate() {
        return manifacturedDate;
    }

    public void setManifacturedDate(Calendar manifacturedDate) {
        this.manifacturedDate = manifacturedDate;
    }

    public Calendar getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        ExpiryDate = expiryDate;
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(ArrayList<String> sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getManfacturingCompany() {
        return manfacturingCompany;
    }

    public void setManfacturingCompany(String manfacturingCompany) {
        this.manfacturingCompany = manfacturingCompany;
    }

    public Timings getTimes() {
        return times;
    }

    public void setTimes(Timings times) {
        this.times = times;
    }

    public ArrayList<String> getChemicals() {
        return chemicals;
    }

    public void setChemicals(ArrayList<String> chemicals) {
        this.chemicals = chemicals;
    }
}
