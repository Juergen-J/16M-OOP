package homework19.app;

import homework19.data.MyString;

public class MyStringApplication {
    public static void main(String[] args) {
        MyString myString = new MyString("My String");

        for (Character c : myString) {
            System.out.println(c);
        }
    }
}
