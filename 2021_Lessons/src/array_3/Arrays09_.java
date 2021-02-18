package array_3;

import java.util.Arrays;

public class Arrays09_ {
    public static void main(String[] args) {
        System.out.println("***********#9");
        shiftLeft(new int[]{6, 2, 5, 3});// → [2, 5, 3, 6]
        shiftLeft(new int[]{1, 2});// → [2, 1]
        shiftLeft(new int[]{1});// → [1]

        System.out.println("***********#10");
        post4(new int[]{2, 4, 1, 2});// → [1, 2]
        post4(new int[]{4, 1, 4, 2});// → [2]
        post4(new int[]{4, 4, 1, 2, 3});// → [1, 2, 3]
    }

    public static int[] shiftLeft(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            output[i - 1] = arr[i];
        }
        output[output.length - 1] = arr[0];
        System.out.println(Arrays.toString(output));
        return output;
    }//9

    public static int[] post4(int[] array) {
        int temp = findLength(array) + 1;
        int length = array.length - temp;
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[temp];
            temp++;
        }
        System.out.println(Arrays.toString(result));

        return result;
    }//10

    public static int findLength(int[] arr) {
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i] == 4) {
                return i;
            }
        }
        return 0;
    }//10

}
