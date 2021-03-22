package homework19.iterators;

import homework19.data.MyString;

import java.util.Iterator;

public class MySrtingIterator implements Iterator<Integer> {
    private MyString range;
    private int position;

    public MySrtingIterator(MyString range) {
        this.range = range;
        position = range.getMin();
    }

    @Override
    public boolean hasNext() {
        if (position <= range.getMax())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        return position++;
    }
}
