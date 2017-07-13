package com.Cerner.Recruitment.DiseaseTemplates;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by saibaba on 7/12/17.
 */
enum Severity{
    LOW, MEDIUM, HIGH
}
public class Disease {
    String name;
    ArrayList<String> symptoms = new ArrayList<>();
    ArrayList<String> suggestions = new ArrayList<>();
    Severity severity;
    Calendar startDate;
    Calendar stopDate;

    Disease(){}

    public Disease(String name, ArrayList<String> symptoms, ArrayList<String> suggestions, Severity severity, Calendar startDate, Calendar stopDate) {
        this.name = name;
        this.symptoms = symptoms;
        this.suggestions = suggestions;
        this.severity = severity;
        this.startDate = startDate;
        this.stopDate = stopDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(ArrayList<String> suggestions) {
        this.suggestions = suggestions;
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

    public Calendar getStopDate() {
        return stopDate;
    }

    public void setStopDate(Calendar stopDate) {
        this.stopDate = stopDate;
    }
}
