package com.Cerner.Recruitment.TemperatureTemplate;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by saibaba on 7/11/17.
 */
enum Measured_IN {
    KELVIN,
    CELSIUS,
    FAHRENHEIT
}

enum Body_Location {
    ARM_PIT,
    EAR,
    MOUTH
}

// List of temperature
// When did he get fever
// measured at different body location
// Body temp may vary from person to person.

public class Temperature {
    boolean type;
    Measured_IN measurement;
    float temparature;
    float default_temparature;
    Body_Location location;
    Calendar cal = Calendar.getInstance();

    Temperature() {
    }

    Temperature(boolean type, Measured_IN measurement, float temparature, float default_temparature, Body_Location location) {
        this.type = type;
        this.measurement = measurement;
        this.temparature = temparature;
        this.cal.setTime(new Date());
        if (type) {
            // cold blooded
            this.default_temparature = 97;
        } else {
            // warm blooded
            this.default_temparature = 100;
        }
    }

    void checkTemparatures(ArrayList<Temperature> temps) {
        compareTemparatures(temps);
    }

    void compareTemparatures(ArrayList<Temperature> temps) {
        comparing:                                        //label
        for (Temperature t1 : temps) {                   //enhanced for loop
            for (Temperature t2 : temps) {
                if (t1.location == t2.location) { // order of n2 -> n times n
                    Date d2 = t2.cal.getTime();
                    Date d1 = t1.cal.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss.SSSZ");
                    String s2 = sdf.format(d2);
                    String s1 = sdf.format(d1);

                    String[] s2_ele = s2.split(" "); // [2014-04-09, T, 10:30:300]
                    String[] s1_ele = s1.split(" "); // [2014-04-09, T, 11:30:300]

                    String day1 = s1_ele[0]; // 2014-04-09
                    String day2 = s2_ele[0]; // 2014-04-09

                    String[] day1_ele = day1.split("-"); // [2014, 04, 09] 
                    String[] day2_ele = day2.split("-"); // [2014, 04, 09]

                    String year1_ele = day1_ele[0]; // "2014"
                    String year2_ele = day2_ele[0]; // "2014"
                    int year1 = Integer.parseInt(year1_ele); // 2014
                    int year2 = Integer.parseInt(year2_ele); // 2014

                    if (year2 == year1) { // same year
                        String month1_ele = day1_ele[1]; // "04"
                        String month2_ele = day2_ele[1]; // "04"
                        int month1 = Integer.parseInt(month1_ele); // 04
                        int month2 = Integer.parseInt(month2_ele); // 04

                        if (Math.abs(month1 - month2) == 0) { // same month
                            String ele1 = day1_ele[2]; // "09"
                            String ele2 = day2_ele[2]; // "09"

                            int date1 = Integer.parseInt(ele1); // 09
                            int date2 = Integer.parseInt(ele2); // 09

                            if (date1 == date2) { // same day
                                String time1 = s1_ele[2]; // "10:30:300"
                                String time2 = s2_ele[2]; // "11:30:300"

                                String[] time1_ele = time1.split(":"); // [10,30,300]
                                String[] time2_ele = time2.split(":"); // [11,30,300]

                                String hour1 = time1_ele[0]; // "10"
                                String hour2 = time2_ele[0]; // "11"

                                int parse_hour1 = Integer.parseInt(hour1); // 10
                                int parse_hour2 = Integer.parseInt(hour2); // 11

                                // Take 10 as threshold value for comparing 2 temp. if not take new reading
                                // if within 10 hours, lets check
                                if (Math.abs(parse_hour2 - parse_hour1) <= 10) {
                                    if (t1.measurement == t2.measurement) {
                                        calculateFever(t1.temparature, t2.temparature,t1.default_temparature,t2.default_temparature);
                                        break comparing;
                                    } else {
                                        // Measured in two formats;
                                        float temp2 = t2.convert(t1.measurement); // converts into same format
                                        calculateFever(t1.temparature, temp2,t1.default_temparature,t2.default_temparature);
                                        break comparing;
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }

    void calculateFever(float t1, float t2, float t1_default, float t2_default) { // (97, 100, 94, 94), (100,97,94,94)
        float temp_diff = t2 - t1; // 100-97 = 3
        if (temp_diff > 0) { // t2 is bigger
            float diff = t2 - t2_default;
            if(diff >= 5){
                System.out.println("got fever");
            }
        } else if(temp_diff <0){ // 97 -100 = -3, t1 is bigger
            float diff = t1 - t1_default;
            if(diff >=5){
                System.out.println("got fever");
            }
        }else{
            System.out.println("Same body temp");
        }
    }

    float convert(Measured_IN measured) {
        if (measured == Measured_IN.CELSIUS) {
            if (this.measurement != Measured_IN.CELSIUS) {
                if (this.measurement == Measured_IN.FAHRENHEIT) { // fahrenheit -> Celsius
                    return (this.temparature - 32) * (5 / 9);
                } else { // kelvin -> Celsius
                    return (this.temparature - 273);
                }
            } else {
                return this.temparature; // no need to convert
            }
        } else if (measured == Measured_IN.FAHRENHEIT) {
            if (this.measurement != Measured_IN.FAHRENHEIT) {
                if (this.measurement == Measured_IN.CELSIUS) { // Celsius -> Fahrenheit
                    return (this.temparature - 32) * (5 / 9);
                } else { // Kelvin to Fahrenheit
                    return (this.temparature - 273) * (9 / 5) + 32;
                }
            } else{
                return this.temparature; // no need to convert
            }
        } else if (measured == Measured_IN.KELVIN) {
            if (this.measurement != Measured_IN.KELVIN) { // if not same
                if (this.measurement == Measured_IN.CELSIUS) { // if celsius -> Kelvin
                    return this.temparature + 273;
                } else { // if fahrenheit -> Kelvin
                    return ((this.temparature - 32) + 273) * (5 / 9);
                }
            } else {
                return this.temparature; // no need to convert
            }
        }
        return 0;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Measured_IN getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measured_IN measurement) {
        this.measurement = measurement;
    }

    public float getTemparature() {
        return temparature;
    }

    public void setTemparature(float temparature) {
        this.temparature = temparature;
    }

    public float getDefault_temparature() {
        return default_temparature;
    }

    public void setDefault_temparature(float default_temparature) {
        this.default_temparature = default_temparature;
    }

    public Body_Location getLocation() {
        return location;
    }

    public void setLocation(Body_Location location) {
        this.location = location;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
}
