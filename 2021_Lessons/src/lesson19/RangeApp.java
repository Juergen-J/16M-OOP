package lesson19;

import java.util.Iterator;

public class RangeApp {
    public static void main(String[] args) {
        int min = 11;
        int max = 25;
        Range r = new Range(min, max);
        //#1
        for (int x : r) {
            System.out.println(x);
        }

        //#2
        RangeIterator ri = new RangeIterator(r);
        while (ri.hasNext()) {
            System.out.printf("%d, ", ri.next());
        }

    }
}
