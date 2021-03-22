package lesson20.iterators;

import lesson20.model.MyString;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder strB;
    private int curPos;
    private int size;

    public MyStringIterator(StringBuilder strB) {
        this.strB = strB;
        curPos = 0;
        size = strB.length();
    }


    @Override
    public boolean hasNext() {
        return curPos < size;
    }

    @Override
    public Character next() {
        return strB.charAt(curPos++);
    }

    @Override
    public void remove(){
        strB.deleteCharAt(--curPos);
        size--;
    }
}
