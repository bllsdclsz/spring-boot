package com.eko.ch;

import java.util.List;

public class Classroom {
    private List<Teacher> teachers;
    private List<Student> students;
    private String location;
    private String name;

    public Classroom(List<Teacher> teachers, List<Student> students, String location, String name) {
        this.teachers = teachers;
        this.students = students;
        this.location = location;
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
