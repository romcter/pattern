package com.example.visitor;

public class PrepareBag implements SchoolBusiness {

    @Override
    public void prepareToLesson(SchoolPerson schoolPerson) {
        schoolPerson.create(this);
    }
}
