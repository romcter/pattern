package com.example.visitor;

public class Teacher implements SchoolPerson {

    @Override
    public void create(ReadingBook readingBook) {
        System.out.println("Teacher reading book ...");
    }

    @Override
    public void create(RecapitulateBook recapitulateBook) {
        System.out.println("Teacher recapitulate book ...");
    }

    @Override
    public void create(HomeWork homeWork) {
        System.out.println("Teacher check students HW ...");
    }

    @Override
    public void create(PrepareBag prepareBag) {
        System.out.println("Teacher prepare for tomorrow ...");
    }
}
