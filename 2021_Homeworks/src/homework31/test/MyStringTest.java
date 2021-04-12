package homework31.test;

import homework31.dto.MyString;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    MyString myString;
    Character[] charArr;

    @Before
    public void setUp() throws Exception {
        myString = new MyString("My String");
        charArr = new Character[]{'M', 'y', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
    }

    @Ignore
    @Test
    public void test() {
        assertEquals('y', myString.getChar(1));

        int i = 0;
        for (Character c : myString) {
            assertEquals(charArr[i++], c);

        }
    }

    @Test
    public void testReverse() {
        int i = charArr.length - 1;
        for (Character c : myString) {
            assertEquals(charArr[i--], c);

        }
    }
}