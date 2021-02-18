package data;

public class Book {
    private String name;
    private String author;
    private int publishingYear;
    private int pages;
    private String binding;
    private String genre;
    private double rating;
    private double price;
    private static int SN = 00001;


    public Book() {
        SN++;
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
        SN++;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public String getBinding() {
        return binding;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public static int getSN() {
        return SN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void setSN(int SN) {
        Book.SN = SN;
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
