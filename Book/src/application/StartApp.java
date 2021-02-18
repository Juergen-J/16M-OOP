package application;

import dao.Shelf;
import data.Book;

public class StartApp {
    public static void main(String[] args) {
        Shelf shelf01 = new Shelf(10);

        Book book01 = new Book("Alphabet", "F.J. Yaika", 1999, 33, "hart", "Krimi", 4.9, 4.99);
        Book book02 = new Book("war and peace ", "L.N. T...", 2000, 9966, " hart", "Roman", 5.0, 100.99);
        Book book03 = new Book("Rectal cucumber", "Malahov", 2002, 1, "soft", "Manual", 1.3, 99);
        Book book04 = new Book("JAVA", "Andron13", 2020, 89, "online", "textbook", 4.99, 56);
        Book book05 = new Book("HTML Tags", "Peoples", 2021, 44, "online", "textbook", 4.0, 0);

        shelf01.addBook(book01);
        shelf01.addBook(book02);
        shelf01.addBook(book03);
        shelf01.addBook(book04);
        shelf01.addBook(book05);

        shelf01.deleteBook(book05);
//        shelf01.books[0].toDisplay();
//        printShelf(shelf01);
//        bookSort(shelf01);
        cocktailSort(shelf01);
        printShelf(shelf01);
    }

    // TODO: Sort
    public static void bookSort(Shelf shelf) {        //nach dem Preis
        int count = 0;
        for (int i = 0; i < shelf.size - 1; i++) {
            if (shelf.books[i].getPrice() > shelf.books[i + 1].getPrice()) {
                replacement(shelf, i);
                count++;
            }
        }
        if (count > 0) {
            bookSort(shelf);
        }

    }

    private static void cocktailSort(Shelf shelf) {
        int start = 0;
        int end = shelf.size - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = start; j < end; j++) {
                if (shelf.books[j].getPrice() > shelf.books[j + 1].getPrice()) {
                    replacement(shelf, j);
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (shelf.books[k].getPrice() < shelf.books[k - 1].getPrice()) {
                    Book temp = shelf.books[k - 1];
                    shelf.books[k - 1] = shelf.books[k];
                    shelf.books[k] = temp;
                    swapped = true;
                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }
    }

    public static void replacement(Shelf shelf, int i) {
        Book temp = shelf.books[i];
        shelf.books[i] = shelf.books[i + 1];
        shelf.books[i + 1] = temp;
    }

    public static void printShelf(Shelf shelf) {
        for (int i = 0; i < shelf.size; i++) {
            System.out.println("Book #" + i + 1 + ":");
            shelf.books[i].toDisplay();
        }
    }
}
