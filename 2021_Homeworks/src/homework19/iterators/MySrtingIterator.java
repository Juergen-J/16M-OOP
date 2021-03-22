package homework19.iterators;

import homework19.data.MyString;

import java.util.Iterator;

public class MySrtingIterator implements Iterator<Character> {
    private MyString str;
    private int curPos;
    private int size;

    public MySrtingIterator(MyString str) {
        this.str = str;
        curPos = 0;
        size = str.getLengthArray();
    }

    @Override
    public boolean hasNext() {
        return curPos < size;
    }

    @Override
    public Character next() {
        return str.getArray()[curPos++];
    }
}
