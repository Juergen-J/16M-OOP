package homework18.comparators;

import homework18.data.Car;

import java.util.Comparator;

public class ComparatorByYearAndPrice implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (Math.abs(o1.getPrice() - o2.getPrice()) < 1E-6) {
            return o1.getYear() - o2.getYear();
        }
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
