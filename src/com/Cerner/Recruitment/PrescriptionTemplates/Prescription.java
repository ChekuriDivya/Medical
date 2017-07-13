package com.Cerner.Recruitment.PrescriptionTemplates;

import java.util.*;

/**
 * Created by saibaba on 7/10/17.
 */
public class Prescription {
    String prescribed_by;
    ArrayList<Medicines> meds;

    Prescription(){}
    Prescription(String prescribed_by, ArrayList<Medicines> meds){
        this.prescribed_by = prescribed_by;
        this.meds = meds;
        notify_To_Take_Medicines();
    }

    void notify_To_Take_Medicines(){
        ArrayList<String> list = new ArrayList<>();
        for (Medicines med : meds) {
            Calendar start = med.getStart();
            Calendar stop = med.getStop();

            Date startDate = start.getTime();
            Date stopDate = stop.getTime();
            Date currentDate = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd T HH:MM:SS:SSS");
//            String starting = sdf.format(startDate);
//            String ending = sdf.format(stopDate);
//            String current = sdf.format(new Date());


            long milliseconds = currentDate.getTime() - startDate.getTime();
            if (milliseconds == 0) {
                // starting date == current date
                Timings t = med.getTimes();
                if (t == Timings.AFTER_BREAKFAST) {
                    int days = Math.round(milliseconds / (60 * 60 * 60));
                    for (int i = 0; i < days; i++) {
                        list.add("Take Medicine");
                    }
                } else if (t == Timings.BEFORE_BREAKFAST) {
                    int days = Math.round(milliseconds / (60 * 60 * 60));
                    for (int i = 0; i < days; i++) {
                        list.add("Take Medicine");
                    }
                } else if (t == Timings.FOUR_HOURS) {
                    int days = Math.round(milliseconds / (60 * 60 * 60));
                    for (int j = 0; j < days; j++) {
                        int per_day = 24 / 4;
                        for (int i = 0; i < per_day; i++) {
                            list.add("Take Medicine");
                        }
                    }
                } // similarly for others as well.
            }
        }


        for(Medicines med: meds){
            Timings t = med.getTimes();
            if(t == Timings.FOUR_HOURS){
                while(!list.isEmpty()){
                    boolean breakfast_taken = true;
                    if(breakfast_taken) {
                        list.remove(0); // for first day
                        // Make thread sleep for 4 Hours
                    }
                }
            }else if(t == Timings.BEFORE_BREAKFAST){
                while(!list.isEmpty()){
                    boolean breakfast_taken = false;
                    if(!breakfast_taken) {
                        list.remove(0); // for first day
                        // Make thread sleep for 24 Hours
                    }
                }
            }else if(t == Timings.AFTER_BREAKFAST){
                while(!list.isEmpty()){
                    boolean breakfast_taken = true;
                    if(breakfast_taken) {
                        list.remove(0); // for first day
                        // Make thread sleep for 24 Hours
                    }
                }
            } // similarly for others as well.
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
