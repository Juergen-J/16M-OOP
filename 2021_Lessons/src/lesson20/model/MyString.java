package lesson20.model;

import lesson20.iterators.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private StringBuilder strB;


    public MyString(String str) {
        this.strB = new StringBuilder(str);
    }

    public void addChar(char c) {
        strB.append(c);
    }

    public void removeChar(char c) {
        int index = strB.indexOf(Character.toString(c));
        strB.deleteCharAt(index);
    }

    public StringBuilder getStrB() {
        return strB;
    }

    @Override
    public String toString() {
        return strB.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(strB);
    }
}
