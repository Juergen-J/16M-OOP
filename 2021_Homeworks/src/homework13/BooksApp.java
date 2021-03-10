package homework13;

public class BooksApp {
    public static void main(String[] args) {
        Book book1 = new Book(9783832170639L, "Haruki Murakami", "Erste Person Singular", 224, 0.085);
        Book book2 = new Book(9783641230364L, "Barack Obama", "Ein verheißenes Land", 1024, 0.032);
        Book book3 = new Book(9783518763339L, "Merle Kröger", "Die Experten", 350, 0.049);
        Book book4 = new Book(9783446270176L, "Ottessa Moshfegh", "Der Tod in ihren Händen", 256, 0.066);
        Book book5 = new Book(9783641277338L, "Horst Eckert", "Die Stunde der Wut", 448, 0.022);
        Book book6 = new Book(9783426454602L, "Ursula Poznanski", "VANITAS - Rot wie Feuer", 400, 0.037);

        Book[] books = new Book[]{book1, book2, book3, book4, book5, book6};

        printBooks(books);
        System.out.printf("The cost of all books %.2f Euro", getFullPrice(books));

    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public static double getFullPrice(Book[] books) {
        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPricePerPage() * books[i].getCountPages();
        }
        return sum;
    }

}
