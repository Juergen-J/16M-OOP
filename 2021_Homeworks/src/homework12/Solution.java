package homework12;

public class Solution {
    public static void main(String[] args) {
        count7(717, 0);// → 2
        count7(7, 0);// → 1
        count7(123, 0);// → 0
    }

    public static void count7(int num, int count) {
        if (num == 0) {
            System.out.println(count);
            return;
        }
        if (num == 7 || num % 10 == 7) {
            count++;
        }
        count7(num / 10, count);
    }
}
