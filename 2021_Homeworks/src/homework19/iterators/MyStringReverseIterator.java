package homework19.iterators;


import homework19.data.MyString;

import java.util.Iterator;

public class MyStringReverseIterator implements Iterator<Integer> {
    private MyString range;
    private int position;

    public MyStringReverseIterator(MyString range) {
        this.range = range;
        position = range.getMax();
    }

    @Override
    public boolean hasNext() {
        if (position >= range.getMin())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        return position--;
    }
}
