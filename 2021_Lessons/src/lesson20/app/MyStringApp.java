package lesson20.app;

import lesson20.model.MyString;

public class MyStringApp {
    public static void main(String[] args) {
        MyString myString = new MyString("String");

        System.out.println(myString);

        for (Character c : myString) {
            System.out.println(c + " ");

        }
    }
}
