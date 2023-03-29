package com.example.visitor;

public class SchoolRunner {
    public static void main(String[] args) {
        School school = new School();

        SchoolPerson student = new Student();
        SchoolPerson teacher = new Teacher();

        System.out.println("================ Student prepare =================");
        school.prepareToLesson(student);

        System.out.println("================ Teacher prepare =================");
        school.prepareToLesson(teacher);
    }
}
