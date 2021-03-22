package homework19.app;

import homework19.data.MyString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringApplicationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPositive() {
        MyString myString = new MyString("Hello");
        Character[] ex = {'H', 'e', 'l', 'l', 'o'};
        int count = 0;
        for (Character c : myString) {
            assertEquals(ex[count++], c);
        }
    }

    @Test
    public void testNull() {
        MyString myString = new MyString(null);
        assertEquals(0, myString.getLengthArray());
        MyString myString2 = new MyString(" " + " ");
        assertEquals(0, myString.getLengthArray());

    }
}