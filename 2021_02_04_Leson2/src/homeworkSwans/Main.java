package homeworkSwans;

public class Main {
    public static void main(String[] args) {
        Swan swen = new Swan("Swen", 5);
        Swan tim = new Swan("Tim", 9);
        Swan tina = new Swan("Tina", 3);
        Swan dog = new Swan("Dog", 6);
        Swan don = new Swan("Don-Huan", 99);

        Swan[] arr = new Swan[]{swen, tim, tina, dog, don};
        Swan.printSwanArr(arr);
//        AgeSort.ageSort(arr);
        AgeSort.cocktailSort(arr);
        Swan.printSwanArr(arr);
    }
}
