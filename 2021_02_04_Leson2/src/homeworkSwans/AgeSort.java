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

    static void cocktailAgeSort(Swan[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = start; j < end; j++) {
                if (array[j].age > array[j + 1].age) {
                    Swan temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k].age < array[k - 1].age) {
                    Swan temp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                    swapped = true;
                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }
    }
}
