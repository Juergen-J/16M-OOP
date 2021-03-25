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

    @Test
    public void testRemoveObject() {
        assertEquals(false, numbers.remove(null));
        Integer temp = 10;
        assertEquals(true, numbers.remove(temp));
        assertEquals(6, numbers.size());
        assertEquals(true, numbers.remove(temp));
        assertEquals(5, numbers.size());
        assertEquals(false, numbers.remove(temp));

        assertEquals(false, strings.remove(null));
        String tempStr = "abc";
        assertEquals(true, strings.remove(tempStr));
        assertEquals(3, strings.size());
        assertEquals(true, strings.remove("acb"));
        assertEquals(2, strings.size());
        assertEquals(false, strings.remove(tempStr));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf(500));
        assertEquals(0, numbers.indexOf(10));
        assertEquals(1, strings.indexOf("lmn"));
        assertEquals(-1, strings.indexOf("lmnp"));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(-1, numbers.lastIndexOf(500));
        assertEquals(5, numbers.lastIndexOf(10));
        assertEquals(1, strings.lastIndexOf("lmn"));
        assertEquals(-1, strings.lastIndexOf("lmnp"));
        assertEquals(3, strings.lastIndexOf("acb"));
    }

    @Test
    public void testContains() {
        assertEquals(false, numbers.contains(null));
        assertEquals(false, numbers.contains(1000));
        assertEquals(true, numbers.contains(10));
        assertEquals(true, strings.contains("acb"));
        assertEquals(false, strings.contains(null));
    }

    @Test
    public void testToArray() {
        Integer[] arrNumbersTest = {10, 7, 11, -2, 13, 10, 2000};
        String[] arrStringsTest = {"abc", "lmn", "fg", "acb"};
        assertEquals(arrNumbersTest[0], numbers.toArray()[0]);
        assertEquals(arrNumbersTest, numbers.toArray());
        assertEquals(arrNumbersTest.length, numbers.toArray().length);
        assertEquals(arrStringsTest[3], strings.toArray()[3]);
        assertEquals(arrStringsTest, strings.toArray());
        assertEquals(arrStringsTest.length, strings.toArray().length);
    }

    @Test
    public void testClear() {
        numbers.clear();
        assertEquals(0, numbers.size());
        strings.clear();
        assertEquals(0, strings.size());
    }

    @Test
    public void testIterable() {
        int count = 0;
        for (Object o : numbers) {
            assertEquals(arrNumbers[count++], o);
        }
        assertEquals(arrNumbers.length, count);
    }

}