package com.Cerner.Recruitment.PrescriptionTemplates;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by saibaba on 7/10/17.
 */
class Medicines {
    String name;
    Calendar start;
    Calendar stop;
    Calendar timings;
    String dosage;
    int quanitity;
    Calendar manifacturedDate;
    Calendar expiryDate;
    ArrayList<String> sideEffects;
    String manfacturingCompany;
    Timings times;
    ArrayList<String> chemicals;
    boolean refill;

    Medicines(){}

    public Medicines(String name, Calendar start, Calendar stop, Calendar timings, String dosage, int quanitity, Calendar manifacturedDate, Calendar expiryDate, ArrayList<String> sideEffects, String manfacturingCompany, Timings times, ArrayList<String> chemicals, boolean refill) {
        this.name = name;
        this.start = start;
        this.stop = stop;
        this.timings = timings;
        this.dosage = dosage;
        this.quanitity = quanitity;
        this.manifacturedDate = manifacturedDate;
        this.expiryDate = expiryDate;
        this.sideEffects = sideEffects;
        this.manfacturingCompany = manfacturingCompany;
        this.times = times;
        this.chemicals = chemicals;
        this.refill = refill;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }

    public boolean isRefill() {
        return refill;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return expiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        this.expiryDate = expiryDate;
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
