package lesson14.items;

public class KidsFictionBook extends FictionBook {
    int age;
    int pSubs;

    public KidsFictionBook() {
    }

    public KidsFictionBook(long isbn, String author, String title, int countPages, double pricePerPage, String genre, boolean isBestSeller, int age, int pSubs) {
        super(isbn, author, title, countPages, pricePerPage, genre, isBestSeller);
        this.age = age;
        this.pSubs = pSubs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getpSubs() {
        return pSubs;
    }

    public void setpSubs(int pSubs) {
        this.pSubs = pSubs;
    }


}
