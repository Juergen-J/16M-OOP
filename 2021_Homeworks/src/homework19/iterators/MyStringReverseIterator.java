package homework19.iterators;


import homework19.data.MyString;

import java.util.Iterator;

public class MyStringReverseIterator implements Iterator<Character> {
    private MyString str;
    private int curPos;
    private int end;

    public MyStringReverseIterator(MyString str) {
        this.str = str;
        curPos = str.getLengthArray() - 1;
        end = 0;
    }

    @Override
    public boolean hasNext() {
        return curPos >=end;
    }

    @Override
    public Character next() {
        return str.getArray()[curPos--];
    }
}
