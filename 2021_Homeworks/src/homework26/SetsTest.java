package homework26;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetsTest {
    Set<Integer> set = new HashSet<>();
    Integer[] test = {3, 1, 8, 0, 9, 7, 4, 2, 11};

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < test.length; i++) {
            set.add(test[i]);
        }
//        set = new HashSet<Integer>(Arrays.asList(test));
    }

    @Test
    public void testAdd() {
        assertEquals(test.length, set.size());
        for (Integer i : test) {
            assertTrue(set.contains(i));
        }
        assertTrue(set.containsAll(Arrays.asList(test)));

//        Integer[] test2 = {3, 1, 8, 0, 9, 7, 4, 2, 11, 11};
//        assertTrue(set.containsAll(Arrays.asList(test2)));

        assertTrue(set.add(12));
        assertEquals(test.length + 1, set.size());
        assertTrue(set.contains(12));

        assertFalse(set.add(0));
        assertEquals(test.length + 1, set.size());

        List<Integer> list = new LinkedList<>(Arrays.asList(22, 23, 24));
        assertTrue(set.addAll(list));
        assertEquals(test.length + 4, set.size());
        assertTrue(set.containsAll(list));
    }

}

