package visitor;

public class HomeWork implements SchoolBusiness {

    @Override
    public void prepareToLesson(SchoolPerson schoolPerson) {
        schoolPerson.create(this);
    }
}
