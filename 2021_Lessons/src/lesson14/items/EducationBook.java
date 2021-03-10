package lesson14.items;

public class EducationBook extends Book{
    String subject;
    int pSub;

    public EducationBook() {
    }

    public EducationBook(long isbn, String author, String title, int countPages, double pricePerPage, String subject, int pSub) {
        super(isbn, author, title, countPages, pricePerPage);
        this.subject = subject;
        this.pSub = pSub;
    }
}
