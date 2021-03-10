package homework13;

import java.util.Arrays;

public class Book {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Book() {
        author = "No author";
        title = "No title";

    }

    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {
        setIsbn(isbn);

        if (author == null || author.trim().isEmpty())
            this.author = "No author";
        else
            this.author = author;
        if (title == null || author.trim().isEmpty())
            this.title = "No title";
        else
            this.title = title;

        if (countPages > 0 && countPages < 10000)
            this.countPages = countPages;

        if (pricePerPage > 0 && pricePerPage < 10)
            this.pricePerPage = pricePerPage;

    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if (isISBNRight(isbn))
            this.isbn = isbn;
        else
            System.out.println("Wrong isbn");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            System.out.println("Wrong author");
        else
            this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || author.trim().isEmpty()) {
            System.out.println("Wrong enter!");
        } else {
            this.title = title;
        }
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages > 0 && countPages < 10000)
            this.countPages = countPages;
        else {
            System.out.println("Wrong enter!");
        }

    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0 && pricePerPage < 10) {
            this.pricePerPage = pricePerPage;
        } else {
            System.out.println("Wrong enter");
        }
    }

    private boolean isISBNRight(long isbn) {
        String temp = String.valueOf(isbn);
        return temp.length() == 13 ? true : false;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}
