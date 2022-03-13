package com.eko.ch;


public class Teacher extends Person {
    private Speciality speciality;

    public Teacher(String firstName, String lastName, String birthDay, Speciality speciality) {
        super(firstName, lastName, birthDay);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
