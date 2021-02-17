package array_3;

public class Arrays06_08 {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++#6");
        matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10});// → 2
        matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5});// → 3
        matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3});// → 2

        System.out.println("+++++++++++++++++#7");
        modThree(new int[]{2, 1, 3, 5});// → true
        modThree(new int[]{2, 1, 2, 5});// → false
        modThree(new int[]{2, 4, 2, 5});// → true

        System.out.println("+++++++++++++++++#8");
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1);// → false
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2);// → true
        sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3);// → false
        sameEnds(new int[]{1, 6, 45, 99, 13, 5, 1}, 1);// → true
    }

    /**
     * arrays nums1 and nums2 of the same length
     *
     * @param nums1
     * @param nums2
     * @return
     */
    static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums2[i] - nums1[i]) <= 2) {
                count++;
            }
        }
        System.out.println(count);
        return count;
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
