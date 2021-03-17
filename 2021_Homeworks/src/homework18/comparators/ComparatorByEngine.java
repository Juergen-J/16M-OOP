package homework18.comparators;

import homework18.data.Car;

import java.util.Comparator;

public class ComparatorByEngine implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (Math.abs(o1.getEngine() - o2.getEngine()) < 1E-6) {
            return 0;
        } else {
            return Double.compare(o1.getEngine(), o2.getEngine());
        }
    }
}
