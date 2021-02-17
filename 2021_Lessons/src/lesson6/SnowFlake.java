package lesson6;

import java.util.Arrays;

public class SnowFlake {
    public static void main(String[] args) {
        String[][] flake = createFlake(10);
        fillArray(flake);
        printFlake(flake);
    }

    private static String[][] createFlake(int size) {
        size = size % 2 == 0 ? size + 1 : size;
        String[][] result = new String[size][size];
        return result;
    }

    public static void fillArray(String[][] arr) {
        for (int i = 0; i < arr.length / 2; i++) {//top
            for (int j = 0; j < arr[i].length / 2; j++) {//left
                if (i == j) {
                    arr[i][j] = "X ";
                } else {
                    arr[i][j] = "  ";
                }
            }
            for (int j = arr[i].length / 2; j < arr[i].length / 2 + 1; j++) {//middle
                arr[i][j] = "X ";
            }
            for (int j = arr[i].length / 2 + 1; j < arr[i].length; j++) {//right
                if (i + j == arr.length - 1) {
                    arr[i][j] = "X ";
                } else {
                    arr[i][j] = "  ";
                }
            }

        }
        for (int i = arr.length / 2; i < arr.length / 2 + 1; i++) {//middle
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "X ";
            }
        }
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {//bottom
            for (int j = 0; j < arr[i].length / 2; j++) {//left
                if (i + j == arr.length - 1) {
                    arr[i][j] = "X ";
                } else {
                    arr[i][j] = "  ";
                }
            }
            for (int j = arr[i].length / 2; j < arr[i].length / 2 + 1; j++) {//middle
                arr[i][j] = "X ";
            }
            for (int j = arr[i].length / 2 + 1; j < arr[i].length; j++) {//right
                if (i == j) {
                    arr[i][j] = "X ";
                } else {
                    arr[i][j] = "  ";
                }
            }
        }
    }

    public static void printFlake(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


}
