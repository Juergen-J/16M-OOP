package homework31.app;

import homework31.dto.MyString;

public class App {
    public static void main(String[] args) {
        MyString myString = new MyString("String");
        System.out.println(myString);
        System.out.println(myString.getChar(0));
    }
}
