package lesson20.app;

import lesson20.model.MyString;
import org.junit.*;


import static org.junit.Assert.*;

public class MyStringAppTest {
    MyString ms = new MyString("Hello");
    char[] ex = {'H', 'e', 'l', 'l', 'o'};

    @Before
    public void setUp() throws Exception {
        System.out.println("Start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("End");
    }

    @Test
    public void test() {
        assertEquals(ex.length, ms.getStrB().length());
        int count = 0;
        for (char c : ms) {
            assertEquals(ex[count++], c);
        }
    }


}