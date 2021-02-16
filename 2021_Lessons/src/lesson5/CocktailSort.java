package lesson5;

public class CocktailSort {
    public static void main(String[] args) {
        int[] array = createArr(10);
        printArr(array);
        cocktailSort(array);
        printArr(array);

    }

    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    private static int[] createArr(int size) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }

    private static void cocktailSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }

    }
}
