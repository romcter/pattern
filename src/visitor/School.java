package visitor;

public class School implements SchoolBusiness {

    SchoolBusiness[] schoolBusinesses;

    public School() {
        this.schoolBusinesses = new SchoolBusiness[]{
                new ReadingBook(),
                new RecapitulateBook(),
                new HomeWork(),
                new PrepareBag()
        };
    }

    @Override
    public void prepareToLesson(SchoolPerson schoolPerson) {
        for (SchoolBusiness schoolBusiness: schoolBusinesses)
            schoolBusiness.prepareToLesson(schoolPerson);
    }
}
