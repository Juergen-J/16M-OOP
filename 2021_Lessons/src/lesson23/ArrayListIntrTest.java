package lesson23;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListIntrTest {
    ArrayList<String> list = new ArrayList<String>();


    @Test
    public void testList() {
        list.add("String1");
        assertEquals("String1", list.get(0));
        assertEquals(1, list.size());

        list.add("String2");
        list.addAll(list);
        assertEquals(4, list.size());

        assertEquals("String2", list.remove(3));
        assertEquals(0, list.indexOf("String1"));

        list.clear();
        assertEquals(0, list.size());
    }
}