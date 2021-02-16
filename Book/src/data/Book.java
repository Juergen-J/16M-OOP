package data;

public class Book {
    public String name;
    public String author;
    public int publishingYear;
    public int pages;
    public String binding;
    public String genre;
    public double rating;
    public double price;

    public Book(Book book) {

    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int publishingYear, int pages) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
    }

    public Book(String name, String author, int publishingYear, int pages, String binding, String genre) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.binding = binding;
        this.genre = genre;
    }

    public Book(String name, String author, int publishingYear, int pages, String binding, String genre, double rating, double price) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.binding = binding;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }


    public void toDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year of Publishing: " + publishingYear);
        System.out.println("Pages: " + pages);
        System.out.println("Binding: " + binding);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price + " Euro");
        System.out.println("*********************");
    }

}
