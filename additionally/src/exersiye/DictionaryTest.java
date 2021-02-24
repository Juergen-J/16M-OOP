package exersiye;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    Dictionary st;
    Set<String> dictionary = new HashSet<>();

    @Test
    public void test_splitTextWithDictionary_regularCase() {
        Collections.addAll(dictionary, "hello", "world", "super");
        List<String> exp = new ArrayList<>(Arrays.asList("hello", "super"));
        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("hellosuper"));
    }

    @Test
    public void test_splitTextWithDictionary_repeatedWords() {
        Collections.addAll(dictionary, "hello", "world", "super");
        List<String> exp = new ArrayList<>(Arrays.asList("super", "super"));

        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("supersuper"));
    }

    @Test
    public void test_splitTextWithDictionary_repeatedWordsCorrectOrder() {
        Collections.addAll(dictionary, "hello", "world", "super");
        List<String> exp = new ArrayList<>(Arrays.asList("super", "hello", "super"));
        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("superhellosuper"));
    }

    @Test
    public void test_splitTextWithDictionary_oneWordFromDictionary_expNull() {
        Collections.addAll(dictionary, "hello", "world", "super");
        st = new Dictionary(dictionary);
        assertNull(st.splitText("hellopapa"));
    }

    @Test
    public void test_splitTextWithDictionary_misspelling_expNull() {
        Collections.addAll(dictionary, "hello", "world", "super");
        st = new Dictionary(dictionary);
        assertNull(st.splitText("superhelloo"));
    }

    @Test
    public void test_splitTextWithDictionary_emptyString_expNull() {
        Collections.addAll(dictionary, "hello", "world", "super");
        st = new Dictionary(dictionary);
        assertNull(st.splitText(""));
    }

    @Test
    public void test_splitTextWithDictionary_closeWordsInDictionary() {
        Collections.addAll(dictionary, "hello", "hell", "operation");
        List<String> exp = new ArrayList<>(Arrays.asList("hello", "operation"));
        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("hellooperation"));
    }

    @Test
    public void test_splitTextWithDictionary_closeWordsInDictionary1() {
        Collections.addAll(dictionary, "hello", "operation", "hell");
        List<String> exp = new ArrayList<>(Arrays.asList("hell", "operation"));
        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("helloperation"));
    }

    @Test
    public void test_splitTextWithDictionary_closeWordsInDictionary2() {
        Collections.addAll(dictionary, "megaworld", "world", "word");
        List<String> exp = new ArrayList<>(Arrays.asList("world", "megaworld", "word"));
        st = new Dictionary(dictionary);
        assertEquals(exp, st.splitText("worldmegaworldword"));
    }

}