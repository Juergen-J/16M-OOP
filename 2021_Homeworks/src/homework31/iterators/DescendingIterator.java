package homework31.iterators;

import homework31.dto.MyString;

import java.util.Iterator;

public class DescendingIterator implements Iterator<Character> {
    private int position;
    private MyString myString;

    public DescendingIterator(MyString myString) {
        this.myString = myString;
        position = myString.getLength() - 1;
    }


    @Override
    public boolean hasNext() {
        return position > -1;
    }

    @Override
    public Character next() {
        return myString.getChar(position--);
    }
}
