package com.eko.ch;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("kamil", "esen", "10.10.1990", Speciality.ENGLISH));
        teacherList.add(new Teacher("yasar", "yasamaz", "05.4.1984", Speciality.MATH));

        List<Student> studentList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            Student student = new Student("yasin","kan", "5.5.2003");
            studentList.add(student);
        }

        Classroom classroom = new Classroom(teacherList, studentList, "Samsun", "3B");
    }
}
