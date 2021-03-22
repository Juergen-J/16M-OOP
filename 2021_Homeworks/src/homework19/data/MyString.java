package homework19.data;

import homework19.iterators.*;


import java.util.Arrays;
import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private char[] array;

    public MyString(String str) {
        if (str == null || str.trim().isEmpty())
            this.array = new char[0];
        else
            this.array = str.toCharArray();
    }

    public int getLengthArray() {
        return array.length;
    }

    public char[] getArray() {
        return array;
    }


    @Override
    public Iterator<Character> iterator() {
        return new MySrtingIterator(this);
//        return new MyStringReverseIterator(this);
    }

}
