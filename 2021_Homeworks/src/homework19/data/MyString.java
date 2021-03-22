package homework19.data;

import homework19.iterators.MyStringReverseIterator;

import java.util.Iterator;

public class MyString implements Iterable<Integer>{
    private char[] array;
    private int min;
    private int max;

    public MyString(String str) {
        this.array = str.toCharArray();
    }

    public MyString(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getLengthArray() {
        return array.length;
    }

    public char[] getArray() {
        return array;
    }
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min <= max)
            this.min = min;
        else
            System.out.println("Error");
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        if (max >= min)
            this.max = max;
        else
            System.out.println("Error");
    }

    @Override
    public Iterator<Integer> iterator() {
//        return new RangeIterator(this);
        return new MyStringReverseIterator(this);
    }
}
