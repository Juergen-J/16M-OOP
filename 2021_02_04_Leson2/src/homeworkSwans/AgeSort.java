package homeworkSwans;

public class AgeSort {
    public static void ageSort(Swan[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].age > arr[i + 1].age) {
                Swan temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            ageSort(arr);
        }
    }
}
