package dao;

import data.Book;

public class Shelf {
    public Book[] books;
    public int size;

    public Shelf(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1]; //students[i]=null
                //                students[size-1]=null;
                size--;
                return true;
            }
        }

        return false;
    }
}
