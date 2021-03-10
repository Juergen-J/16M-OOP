package lesson14.items;

public class FictionBook extends Book {
    String genre;
    boolean isBestSeller;

    public FictionBook() {
    }

    public FictionBook(long isbn, String author, String title, int countPages, double pricePerPage, String genre, boolean isBestSeller) {
        super(isbn, author, title, countPages, pricePerPage);
        this.genre = genre;
        this.isBestSeller = isBestSeller;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }


}
