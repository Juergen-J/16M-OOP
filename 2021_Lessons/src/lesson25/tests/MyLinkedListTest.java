package lesson25.tests;

import lesson25.model.MyArray;
import lesson25.model.MyLinkedList;
import lesson25.model.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    MyLinkedList myLinkedList = new MyLinkedList();
    Object obj = new Object();

    @Before
    public void setUp() throws Exception {
        myLinkedList.add(null);
        myLinkedList.add("String");
        myLinkedList.add(123);
    }

    @Test
    public void testAdd() {
        assertTrue(myLinkedList.add(obj));
        assertEquals(4, myLinkedList.size());

    }

    @Test
    public void testIndexOf() {
        assertEquals(0, myLinkedList.indexOf(null));
        assertEquals(1, myLinkedList.indexOf("String"));
        assertEquals(2, myLinkedList.indexOf(123));

    }

    @Test
    public void testLastIndexOf() {
        myLinkedList.add(null);
        assertEquals(3, myLinkedList.lastIndexOf(null));
    }

    @Test
    public void testContains() {
        assertTrue(myLinkedList.contains(null));
        assertTrue(myLinkedList.contains("String"));
        assertFalse(myLinkedList.contains(45));
    }

    @Test
    public void testToArray() {
        Object[] ex = myLinkedList.toArray();
        for (int i = 0; i < ex.length; i++) {
            assertEquals(ex[i], myLinkedList.get(i));
        }
        assertEquals(ex.length, myLinkedList.size());
    }

    @Test
    public void testRemove() {
        assertNull(myLinkedList.remove(0));
        assertTrue(myLinkedList.remove("String"));
        assertEquals(1, myLinkedList.size());

    }

    @Test
    public void testClear() {
        assertEquals(3, myLinkedList.size());

//        myLinkedList.clear();
//        assertEquals(0, myLinkedList.size());
    }
}