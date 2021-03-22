package lesson20.app;

import lesson20.iterators.MyStringIterator;
import lesson20.model.MyString;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        MyString myString = new MyString("String");

        System.out.println(myString);

        for (Character c : myString) {
            System.out.println(c + " ");

        }
        deleteChar(myString, 'i');
        System.out.println(myString);
    }

    public static void deleteChar(MyString ms, char ch) {
//        for (Character c : ms) {
//            if (c == ch) {
////                ms.removeChar(ch);
//
//            }
//        }
        Iterator<Character> iter = new MyStringIterator(ms.getStrB());
        while (iter.hasNext()) {
            char c = iter.next();
            if (c == ch) {
                iter.remove();
            }
        }
    }
}
