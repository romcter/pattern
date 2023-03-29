package com.example.visitor;

public class ReadingBook implements SchoolBusiness {

    @Override
    public void prepareToLesson(SchoolPerson schoolPerson) {
        schoolPerson.create(this);
    }
}
