package lesson5;

public class Exercise {
    public static void main(String[] args) {
        int[] newArray = CocktailSort.createArr(10);
        int[] secondArray = new int[]{10, 5, 35, 36, 90, 3, 5, 68, 8, 10};
        int[] defaultArray = new int[10];

        int[] idealArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] uArr = unSortArray(idealArray);
        library.PrintArrays.printArr(uArr);
    }

    private static int[] unSortArray(int[] arr) {
        int[] randomArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = generateRandomIndex(arr.length);

            while (randomArr[temp] != 0) {
                count++;
                temp = generateRandomIndex(arr.length);
            }
            randomArr[temp] = arr[i];
        }
        System.out.println(count);
        return randomArr;
    }

    public static int generateRandomIndex(int max) {
        return (int) (Math.random() * max);
    }
}
