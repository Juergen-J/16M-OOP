package homeworkBooks;

public class Books {
    String name;
    String author;
    int publishingYear;
    int pages;
    String binding;
    String genre;
    double rating;
    double price;

    public Books(Books books) {

    }

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Books(String name, String author, int publishingYear, int pages) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
    }

    public Books(String name, String author, int publishingYear, int pages, String binding, String genre) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.binding = binding;
        this.genre = genre;
    }

    public Books(String name, String author, int publishingYear, int pages, String binding, String genre, double rating, double price) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.binding = binding;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }


//    public void bookInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Author: " + author);
//        System.out.println("Year of Publishing: " + publishingYear);
//        System.out.println("Pages: " + pages);
//        System.out.println("Binding: " + binding);
//        System.out.println("Genre: " + genre);
//        System.out.println("Rating: " + rating);
//        System.out.println("Price: " + price + " Euro");
//    }

}

