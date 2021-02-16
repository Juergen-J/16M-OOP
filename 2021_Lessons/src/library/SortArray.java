package library;

public class SortArray {
    public static void cocktailSort(int[] arr) {
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

    public static int[] unSortArray(int[] arr) {
        int[] randomArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = generateRandomIndex(arr.length);
            while (randomArr[temp] != 0) {
                temp = generateRandomIndex(arr.length);
                count++;
            }
            randomArr[temp] = arr[i];
        }
//        System.out.println(count);
        return randomArr;
    }

    public static int generateRandomIndex(int max) {
        return (int) (Math.random() * max);
    }
}
