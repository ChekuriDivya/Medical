package com.Cerner.Recruitment.TestTemplate;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by saibaba on 7/12/17.
 */
public class Reports {
    String reportName;
    HashMap<String, ArrayList<String>> levels;

    public Reports(String reportName, HashMap<String, ArrayList<String>> levels) {
        this.reportName = reportName;
        this.levels = levels;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public HashMap<String, ArrayList<String>> getLevels() {
        return levels;
    }

    public void setLevels(HashMap<String, ArrayList<String>> levels) {
        this.levels = levels;
    }
}