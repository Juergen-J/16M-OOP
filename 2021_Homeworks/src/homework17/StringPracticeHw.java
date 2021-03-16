package homework17;

public class StringPracticeHw {

    public static String getStrReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        StringBuilder temp = new StringBuilder(str);
        return temp.reverse().toString();
    }

    // TODO: 16.03.2021  why Integer instead int?
    public static Integer getCountWords(String sent, String word) {
        int result = 0;
        if (sent == null || word == null || sent.trim().isEmpty() || word.trim().isEmpty()) {
            return null;
        }

        for (int i = 0; i < sent.length() - word.length() + 1; i++) {
            if (sent.substring(i, i + word.length()).equalsIgnoreCase(word)) {
                result++;
            }
        }
        return result;
    }

}
