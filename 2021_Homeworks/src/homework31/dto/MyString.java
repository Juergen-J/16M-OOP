package homework31.dto;

import homework31.iterators.*;

import java.util.Arrays;
import java.util.Iterator;

public class MyString implements Iterable<Character> {
    char[] arr;

    public MyString(String str) {
        if (str == null || str.trim().isEmpty())
            System.out.println("Wrong String!");
        arr = str.toCharArray();
    }

    public MyString() {
    }


    public char getChar(int i) {
        if (i < 0 || i > arr.length - 1)
            System.out.println("Wrong enter!");
        return arr[i];
    }

    public int getLength() {
        return arr.length;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public Iterator<Character> iterator() {
        return new DescendingIterator(this);
    }
}
