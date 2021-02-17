package homework06;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++1");
        repeatFront("Chocolate", 4);// → "ChocChoChC"
        repeatFront("Chocolate", 3);// → "ChoChC"
        repeatFront("Ice Cream", 2);// → "IcI"

        System.out.println("+++++++++++++++++2");
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));

        System.out.println("+++++++++++++++++3");
        modThree(new int[]{2, 1, 3, 5});// →true
        modThree(new int[]{2, 1, 2, 5});// →false
        modThree(new int[]{2, 4, 2, 5});// →true

        System.out.println("+++++++++++++++++4");
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1);// → false
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2);// → true
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3);// → false
        sameEnds(new int[]{1, 6, 45, 99, 13, 5, 1}, 1);// → true
    }


    public static String repeatFront(String string, int n) {
        String output = string.substring(0, n);
        for (int i = n - 1; i > 0; i--) {
            output += string.substring(0, i);
        }
        System.out.printf("%s \n", output);
        return output;
    }

    public static boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            int temp = str.indexOf("xyz");
            return str.length() - (temp + 3) > 2 ? false : true;
        }
        return false;
    }

    public static boolean modThree(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
                countOdd = 0;
            }
            if (arr[i] % 2 != 0) {
                countOdd++;
                countEven = 0;
            }
            if (countEven > 2 || countOdd > 2) {
                return true;
            }
        }
        return false;
    }

    static boolean sameEnds(int[] nums, int quantity) {
        int count = 0;
        int j = nums.length - quantity;
        for (int i = 0; i < quantity; i++) {
            if (nums[i] == nums[j]) {
                count++;
            }
            j++;
        }
//        System.out.println(count);
        return count == quantity ? true : false;
    }
}
