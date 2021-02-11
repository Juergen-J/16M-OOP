package homework3;

public class SwanTest {
    public static void main(String[] args) {
        Swan swen = new Swan("Swen", "black", 3);
        Swan mino = new Swan("Mino", "yellow", 99);
        Swan tiesto = new Swan("Tiesto", "white", 30);
        Swan makorony = new Swan("Makar", "green", 43);
        Swan lina = new Swan("Lina", "red", 56);

        Swan[] arr = new Swan[]{swen, mino, tiesto, makorony, lina};
        Swan[] newArr = copySwanArr(arr);

        newArr[0].firstName = "XXX";
//        printSwanArr(arr);
//        printSwanArr(newArr);
        deleteElement(newArr, 0);

        Swan lukas = new Swan("Luk", "redRed", 100);
        updateElementArray(newArr, 3, lukas);

    }

    static Swan[] copySwanArr(Swan[] arr) {
        Swan[] newArr = new Swan[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = new Swan(arr[i].firstName, arr[i].color, arr[i].age);
        }
        return newArr;
    }

    static Swan[] deleteElement(Swan[] arr, int element) {
        Swan[] newArr = new Swan[arr.length - 1];
        for (int i = 0; i < element; i++) {
            newArr[i] = new Swan(arr[i].firstName, arr[i].color, arr[i].age);
        }
        for (int i = element + 1; i < arr.length; i++) {
            newArr[i - 1] = new Swan(arr[i].firstName, arr[i].color, arr[i].age);
        }
        return newArr;
    }

    static Swan[] updateElementArray(Swan[] arr, int index, Swan name) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i].firstName = name.firstName;
                arr[i].color = name.color;
                arr[i].age = name.age;
            }
        }
        return arr;
    }

    static void printSwanArr(Swan[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].getInfo();
            System.out.println("\n-|-|-|-|-|-|-|-|-");
        }
    }
}
