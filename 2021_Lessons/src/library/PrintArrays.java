package library;

public class PrintArrays {
    public static void printArr(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println();
    }

    public static void printArr(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println();
    }
}
