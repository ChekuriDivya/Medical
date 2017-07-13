package com.Cerner.Recruitment.DemographicTemplates;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by saibaba on 7/11/17.
 */
enum Gender{
    MALE, FEMALE, NOT_SPECIFIED
}
public class Person {
    String firstName;
    String lastName;
    int age;
    Calendar dob;
    TreeMap<String, ArrayList<String>> phone;
    Address address;
    String ssn;

    // inner class - just to let you know this is also possible
    class Height{
        int feet;
        int inches;

        public Height(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
        }

        public int getFeet() {
            return feet;
        }

        public void setFeet(int feet) {
            this.feet = feet;
        }

        public int getInches() {
            return inches;
        }

        public void setInches(int inches) {
            this.inches = inches;
        }
    }
    Height height;
    float weight;
    Gender gender;
    boolean organDonar;

    public Person(){}
    public Person(String firstName, String lastName, int age, Calendar dob, TreeMap<String, ArrayList<String>> phone, Address address, String ssn, Height height, float weight, Gender gender, boolean organDonar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.ssn = ssn;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.organDonar = organDonar;
    }

    public void recordOldDob(Date dob){
        this.dob = Calendar.getInstance();
        this.dob.setTime(dob);

        // To display only month and year for already born peopl
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        System.out.println(sdf.format(this.dob.getTime()));

        // To display day, month, year for newly born people
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(this.dob.getTime()));
    }

    public void setTimeZone(String city, String country){
        StringBuilder sb = new StringBuilder(city);
        sb.append("/");
        sb.append(country);
        this.dob.setTimeZone(TimeZone.getTimeZone(sb.toString()));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public TreeMap<String, ArrayList<String>> getPhone() {
        return phone;
    }

    public void setPhone(TreeMap<String, ArrayList<String>> phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isOrganDonar() {
        return organDonar;
    }

    public void setOrganDonar(boolean organDonar) {
        this.organDonar = organDonar;
    }
}
