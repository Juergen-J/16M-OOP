package array_3;

public class Arrays01_03 {
    public static void main(String[] args) {
        System.out.println("*******************#1");
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));//3
        System.out.println(countEvens(new int[]{2, 2, 0}));//2
        System.out.println(countEvens(new int[]{1, 3, 5}));//0

        System.out.println("*******************#2");
        System.out.println(sum13(new int[]{1, 2, 2, 1}));//6
        System.out.println(sum13(new int[]{1, 1}));//2
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));//6

        System.out.println("*******************#3");
        System.out.println(lucky13(new int[]{0, 2, 4}));//true
        System.out.println(lucky13(new int[]{1, 2, 3}));//false
        System.out.println(lucky13(new int[]{1, 2, 4}));//false

    }

    private static int countEvens(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0 && ints[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sum13(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                break;
            }
            sum += arr[i];
        }
        return sum;
    }

    public static boolean lucky13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
