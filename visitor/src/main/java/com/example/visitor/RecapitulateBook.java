package com.example.visitor;

public class RecapitulateBook implements SchoolBusiness {

    @Override
    public void prepareToLesson(SchoolPerson schoolPerson) {
        schoolPerson.create(this);
    }
}
