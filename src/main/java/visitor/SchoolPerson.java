package visitor;

public interface SchoolPerson {
    void create(ReadingBook readingBook);
    void create(RecapitulateBook recapitulateBook);
    void create(HomeWork homeWork);
    void create(PrepareBag prepareBag);
}
