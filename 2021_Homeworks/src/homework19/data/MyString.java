package homework19.data;

public class MyString {
    private char[] array;

    public MyString(String str) {
        this.array = str.toCharArray();
    }

    public int getLengthArray() {
        return array.length;
    }

    public char[] getArray() {
        return array;
    }
}
