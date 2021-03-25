package lesson22;

public class ArrayApp {
    public static void main(String[] args) {
        int[] ar = new int[10];

        double[] ar2 = new double[10];


        int[] test = {9, 2, 8, 1, 7, 5, 3};
        printEvenValue(test);

        String[] strArr = {"123", "22", "10", "22", "123"};
        reverseArray(strArr);
        printArr(strArr);
    }

    private static void reverseArray(String[] strArr) {
        String temp;
        for (int i = 0, j = strArr.length - 1; i < strArr.length / 2; i++, j--) {
            temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
        }
    }

    private static void printEvenValue(int[] test) {
        for (int i = 0; i < test.length; i++) {
            if (test[i] % 2 != 0) {
                System.out.printf("%d", test[i]);
            }
        }
        System.out.println();
    }

    private static void printArr(String[] strArr) {
        for (String s : strArr) {
            System.out.printf("%s ", s);
        }
    }
}
