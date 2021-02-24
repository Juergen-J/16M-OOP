package exersiye;

import java.util.*;

public class Dictionary {

    private Set<String> words;

    public Dictionary(Collection<String> words) {
        this.words = new TreeSet<>((word1, word2) -> Integer.compare(word2.length(), word1.length()));
        this.words.addAll(words);
    }

    /**
     * Tries to split the text onto the words
     *
     * @param text to split
     * @return a sequence of words which compose the text
     */
    public List<String> splitText(String text) {
        List<String> res = new ArrayList<>();
        Deque<String> sequence = new ArrayDeque<>();

        try {


            splitRecursievly(text, 0, sequence);
        } catch (TextNotSplittedException e) {
            return null;
        }
        return new ArrayList<>(sequence);
    }

    private void splitRecursievly(String text, int startIndex, Deque<String> sequence) throws TextNotSplittedException {
        if (startIndex == text.length()) {
            return;
        }
        for (String word : words) {
            if (text.startsWith(word, startIndex)) {
                sequence.addLast(word);
                try {
                    splitRecursievly(text, startIndex + word.length(), sequence);
                    return;
                } catch (TextNotSplittedException e) {
                    sequence.removeLast();
                }
            }
        }
        throw new TextNotSplittedException();
    }
}

class TextNotSplittedException extends Exception {

}