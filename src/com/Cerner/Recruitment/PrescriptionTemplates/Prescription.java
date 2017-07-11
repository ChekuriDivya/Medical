package com.Cerner.Recruitment.PrescriptionTemplates;

import java.util.*;

/**
 * Created by saibaba on 7/10/17.
 */
class Prescription {
    String prescribed_by;
    ArrayList<Medicines> meds;

    Prescription(){}
    Prescription(String prescribed_by, ArrayList<Medicines> meds){
        this.prescribed_by = prescribed_by;
        this.meds = meds;
        notify_To_Take_Medicines();
    }

    void notify_To_Take_Medicines(){
        for(Medicines med: meds){
            Calendar start = med.getStart();
            Calendar stop = med.getStop();
            Calendar today = Calendar.getInstance();



        }
    }


    public String getPrescribed_by() {
        return prescribed_by;
    }

    public void setPrescribed_by(String prescribed_by) {
        this.prescribed_by = prescribed_by;
    }

    public ArrayList<Medicines> getMeds() {
        return meds;
    }

    public void setMeds(ArrayList<Medicines> meds) {
        this.meds = meds;
    }
}
