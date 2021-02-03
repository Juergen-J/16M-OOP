public class Books {
    String name;
    String author;
    int publishingYear;
    int pages;
    String binding;
    String genre;
    double rating;
    double price;

    public void bookInfo() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year of Publishing: " + publishingYear);
        System.out.println("Pages: " + pages);
        System.out.println("Binding: " + binding);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price + " Euro");
    }

}

class Test {
    public static void main(String[] args) {
        Books alphabet = new Books();
        Books warAndPeace = new Books();
        Books healthyFood = new Books();
        Books java = new Books();
        Books html = new Books();

        alphabet.name = "Alphabet";
        alphabet.author = "F.J. Yaika";
        alphabet.publishingYear = 1999;
        alphabet.pages = 33;
        alphabet.binding = "hart";
        alphabet.genre = "Krimi";
        alphabet.rating = 4.9;
        alphabet.price = 4.99;
        alphabet.bookInfo();
        System.out.println("****************************");

        warAndPeace.name = "war and peace ";
        warAndPeace.author = "L.N. T...";
        warAndPeace.publishingYear = 2000;
        warAndPeace.pages = 19966;
        warAndPeace.binding = " hart";
        warAndPeace.genre = "Roman";
        warAndPeace.rating = 5.0;
        warAndPeace.price = 100.99;
        warAndPeace.bookInfo();
        System.out.println("****************************");

        healthyFood.name = "Rectal cucumber";
        healthyFood.author = "Malahov";
        healthyFood.publishingYear = 2002;
        healthyFood.pages = 1;
        healthyFood.binding = "soft";
        healthyFood.genre = "Manual";
        healthyFood.rating = 1.3;
        healthyFood.price = 99;
        healthyFood.bookInfo();
        System.out.println("****************************");

        java.name = "JAVA";
        java.author = "Andron13";
        java.publishingYear = 2020;
        java.pages = 89;
        java.binding = "online";
        java.genre = "textbook";
        java.rating = 4.99;
        java.price = 56;
        java.bookInfo();
        System.out.println("****************************");

        html.name = "HTML Tags";
        html.author = "Peoples";
        html.publishingYear = 2021;
        html.pages = 44;
        html.binding = "online";
        html.genre = "textbook";
        html.rating = 4.0;
        html.price = 0;
        html.bookInfo();
        System.out.println("****************************");

    }
}
