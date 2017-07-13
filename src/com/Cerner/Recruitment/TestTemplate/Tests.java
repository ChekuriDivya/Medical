package com.Cerner.Recruitment.TestTemplate;


import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by saibaba on 7/12/17.
 */
public class Tests {
    String testName;
    Calendar testDate;
    ArrayList<Reports> reportsArrayList;

    public Tests(String testName, Calendar testDate, ArrayList<Reports> reportsArrayList) {
        this.testName = testName;
        this.testDate = testDate;
        this.reportsArrayList = reportsArrayList;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Calendar getTestDate() {
        return testDate;
    }

    public void setTestDate(Calendar testDate) {
        this.testDate = testDate;
    }

    public ArrayList<Reports> getReportsArrayList() {
        return reportsArrayList;
    }

    public void setReportsArrayList(ArrayList<Reports> reportsArrayList) {
        this.reportsArrayList = reportsArrayList;
    }
}