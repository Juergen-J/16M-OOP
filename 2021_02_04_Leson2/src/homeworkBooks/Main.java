package homeworkBooks;

public class Main {
    public static void main(String[] args) {
        Books alphabet = new Books("Alphabet", "F.J. Yaika", 1999, 33, "hart", "Krimi", 4.9, 4.99);
        Books warAndPeace = new Books("war and peace ", "L.N. T...", 2000, 9966, " hart", "Roman", 5.0, 100.99);
        Books healthyFood = new Books("Rectal cucumber", "Malahov", 2002, 1, "soft", "Manual", 1.3, 99);
        Books java = new Books("JAVA", "Andron13", 2020, 89, "online", "textbook", 4.99, 56);
        Books html = new Books("HTML Tags", "Peoples", 2021, 44, "online", "textbook", 4.0, 0);

        Books[] booksArr = new Books[]{alphabet, warAndPeace, healthyFood, java, html};
        printBooksArr(booksArr);
        booksSort(booksArr);
        printBooksArr(booksArr);
    }

    // TODO: Sort
    public static void booksSort(Books[] booksArr) {        //nach dem Preis
        int count = 0;
        for (int i = 0; i < booksArr.length - 1; i++) {
            if (booksArr[i].price > booksArr[i + 1].price) {
                Books temp = booksArr[i];
                booksArr[i] = booksArr[i + 1];
                booksArr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            booksSort(booksArr);
        }

    }

    public static void printBooksArr(Books[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name: " + books[i].name);
            System.out.println("Author: " + books[i].author);
            System.out.println("Year of Publishing: " + books[i].publishingYear);
            System.out.println("Pages: " + books[i].pages);
            System.out.println("Binding: " + books[i].binding);
            System.out.println("Genre: " + books[i].genre);
            System.out.println("Rating: " + books[i].rating);
            System.out.println("Price: " + books[i].price + " Euro");
            System.out.println("****************************");
        }
    }
}
