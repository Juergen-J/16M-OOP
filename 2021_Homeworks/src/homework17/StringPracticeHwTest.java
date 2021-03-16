package homework17;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringPracticeHwTest {

    @Test
    public void getStrReversePositiveTest() {
//        str = "Mama" the method will return the string "amaM". If an empty string or null is passed, the method returns null.
        assertEquals("amaM", StringPracticeHw.getStrReverse("Mama"));
        assertEquals(" 01234", StringPracticeHw.getStrReverse("43210 "));
        assertNotNull(StringPracticeHw.getStrReverse("1234"));
        assertNull(StringPracticeHw.getStrReverse("   "));
        assertNull(StringPracticeHw.getStrReverse(""));
        assertNull(StringPracticeHw.getStrReverse(null));


    }


    @Test
    public void getCountWords() {
        int temp = StringPracticeHw.getCountWords("Two beers or not two beers", "beer");
        assertEquals(2, temp);
        temp = StringPracticeHw.getCountWords("BEERTwo  beers or not two beers", "beer");
        assertEquals(3, temp);
        assertNull(StringPracticeHw.getCountWords("Two beers or not two beers", ""));
        assertNull(StringPracticeHw.getCountWords("", ""));
        assertNull(StringPracticeHw.getCountWords("", "beer"));
        assertNull(StringPracticeHw.getCountWords("  ", "   "));
        assertNull(StringPracticeHw.getCountWords(null, "beer"));
        assertNull(StringPracticeHw.getCountWords(null, null));
        assertNull(StringPracticeHw.getCountWords("Two beers or not two beers", null));
        temp = StringPracticeHw.getCountWords("Two  beers or not two beer", "beer");
        assertEquals(2, temp);
        temp = StringPracticeHw.getCountWords("Two  beers or not two bee", "beer");
        assertEquals(1, temp);

    }
}