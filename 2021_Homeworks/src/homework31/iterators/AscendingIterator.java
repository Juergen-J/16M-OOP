package homework31.iterators;

import homework31.dto.MyString;

import java.util.Iterator;

public class AscendingIterator implements Iterator<Character> {
    private int position;
    private MyString myString;

    public AscendingIterator(MyString myString) {
        this.myString = myString;
        position = 0;


    }

    @Override
    public boolean hasNext() {
        return position < myString.getLength();
    }

    @Override
    public Character next() {
        return myString.getChar(position++);
    }
}
