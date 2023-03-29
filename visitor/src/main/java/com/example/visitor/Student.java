package com.example.visitor;

public class Student implements SchoolPerson {

    @Override
    public void create(ReadingBook readingBook) {
        System.out.println("Student reading book ...");
    }

    @Override
    public void create(RecapitulateBook recapitulateBook) {
        System.out.println("Student recapitulate book ...");
    }

    @Override
    public void create(HomeWork homeWork) {
        System.out.println("Student solve HW ...");
    }

    @Override
    public void create(PrepareBag prepareBag) {
        System.out.println("Student prepare bag for tomorrow ...");
    }
}
