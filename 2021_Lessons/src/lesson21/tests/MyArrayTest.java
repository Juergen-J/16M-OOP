package lesson21.tests;

import lesson21.model.MyArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {
    MyArray numbers;
    MyArray strings;
    Integer[] arrNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arrStrings = {"abc", "lmn", "fg", "acb"};

    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer i : arrNumbers) {
            numbers.add(i);
        }
        strings = new MyArray();
        for (String str : arrStrings) {
            strings.add(str);
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arrNumbers.length, numbers.size());
        assertEquals(arrStrings.length, sizeStrings);
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arrNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arrStrings[i], strings.get(i));
        }
    }

    @Test
    public void testRemoveIndex() {
        //10,7,11,-2,13,10,2000
        Integer[] arrNumbers_2 = {10, 7, 11, 13, 10, 2000};
        assertEquals(null, numbers.remove(7));
        assertEquals(null, numbers.remove(17));

        assertEquals(-2, numbers.remove(3));
        assertEquals(arrNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            assertNotEquals(-2, numbers.get(i));
        }

    }


}