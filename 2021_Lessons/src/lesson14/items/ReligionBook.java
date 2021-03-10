package lesson14.items;

public class ReligionBook extends Book {
    String religion;
    double donation;

    public ReligionBook() {
    }

    public ReligionBook(long isbn, String author, String title, int countPages, double pricePerPage, String religion, double donation) {
        super(isbn, author, title, countPages, pricePerPage);
        this.religion = religion;
        this.donation = donation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }


}
