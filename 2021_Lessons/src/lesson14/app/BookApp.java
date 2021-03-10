package lesson14.app;

import lesson14.items.*;

public class BookApp {
    public static void main(String[] args) {
        Book book1 =
                new Book(9783832170639L, "Haruki Murakami", "Erste Person Singular", 224, 0.085);
        Book book2 =
                new Book(9783641230364L, "Barack Obama", "Ein verheißenes Land", 1024, 0.032);
        Book book3 =
                new Book(9783518763339L, "Merle Kröger", "Die Experten", 350, 0.049);
        Book book4 =
                new Book(9783446270176L, "Ottessa Moshfegh", "Der Tod in ihren Händen", 256, 0.066);
        Book book5 =
                new Book(9783641277338L, "Horst Eckert", "Die Stunde der Wut", 448, 0.022);
        Book book6 =
                new Book(9783426454602L, "Ursula Poznanski", "VANITAS - Rot wie Feuer", 400, 0.037);

        ReligionBook book00 =
                new ReligionBook(1111111111111L, "author", "titel1", 569, 0.0, "Religion", 100.00);
        ReligionBook book01 =
                new ReligionBook(1111111111112L, "author02", "titel2", 499, 0.0, "Religion2", 100.00);
        FictionBook book03 =
                new FictionBook(1111111111113L, "author02", "titel2", 499, 0.045, "Genre", true);
        KidsFictionBook book04 =
                new KidsFictionBook(1111111111114L, "author02", "titel2", 499, 0.069, "Genre", false, 13, 30);
        EducationBook book05 = new EducationBook(1111111111114L, "author02", "titel2", 499, 0.06, "Subject", 13);
    }
}
