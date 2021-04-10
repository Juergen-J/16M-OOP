package homework30.telran.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;
import homework30.telran.dateComparator.DateComparator;

public class DateComparatorTest {
    Comparator<String> comparator;

    @Test
    public void TestDateComparator() {
        String[] dates = {"12-03-1999", "05-04-1999", "10-10-1980",
                "09-10-1980", "10-10-2019"};
        String[] expDate = {"09-10-1980", "10-10-1980", "12-03-1999",
                "05-04-1999", "10-10-2019"};
        comparator = new DateComparator();
        Arrays.sort(dates, comparator);
        assertArrayEquals(expDate, dates);
    }
}

