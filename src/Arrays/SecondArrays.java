package Arrays;

import java.awt.*;

public class SecondArrays {

    static int maxNumberCycle(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    static int maxNumberRecursion(int[] array) {
        if (array[0] < array[1]) {
            array[0] = array[1];
            maxNumberRecursion(array);
        }
        if (array[1] < array[2]) {
            array[1] = array[2];
            maxNumberRecursion(array);
        }
        if (array[2] < array[3]) {
            array[2] = array[3];
            maxNumberRecursion(array);
        }
        return array[0];
    }

    static int minNumberCycle(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int minNumberRecursion(int[] array) {
        if (array[0] > array[1]) {
            array[0] = array[1];
            minNumberRecursion(array);
        }
        if (array[1] > array[2]) {
            array[1] = array[2];
            minNumberRecursion(array);
        }
        if (array[2] > array[3]) {
            array[2] = array[3];
            minNumberRecursion(array);
        }
        return array[0];
    }

    static int sumAllNumbersCycle(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    static int sumAllNumbersRecursion(int[] array, int numbersOfElementsInArray) {
        if (numbersOfElementsInArray == 0) {
            return 0;
        }
        return array[numbersOfElementsInArray - 1] + sumAllNumbersRecursion(array, (numbersOfElementsInArray - 1));
    }

    static double averageOfArrayCycle(int[] array) {
        double sum = 0;
        for (int cycle : array
        ) {
            sum += cycle;
        }
        return sum / array.length;
    }

    static double averageOfArrayRecursion(int[] array, int sumElementsInArray) {
        double sum, average;
        if (sumElementsInArray == 1) {
            sum = array[0];
        } else {
            sum = array[sumElementsInArray - 1] + (sumElementsInArray - 1) * averageOfArrayRecursion
                    (array, sumElementsInArray - 1);
        }
        average = sum / sumElementsInArray;
        return average;
    }

    static int[] fillOneDimensionalArrayCycle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    static int fillOneDimensionalArrayRecursion(int[] array, int currentIndex) {
        if (currentIndex < array.length) {
            System.out.println(array[currentIndex]);
            ++currentIndex;
            fillOneDimensionalArrayRecursion(array, currentIndex);
        }
        return array[currentIndex];
    }

    static void fillTwoDimensionalArrayCycle() {
        int[][] arrayTwoDimensional = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayTwoDimensional[i][j] = i * j + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("" + arrayTwoDimensional[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 50, -4};
        System.out.println(maxNumberCycle(array));
        System.out.println(maxNumberRecursion(array));
        System.out.println(minNumberCycle(array));
        System.out.println(minNumberRecursion(array));
        System.out.println(sumAllNumbersCycle(array));
        System.out.println(sumAllNumbersRecursion(array, 4));
        System.out.println(averageOfArrayCycle(array));
        System.out.println(averageOfArrayRecursion(array, 4));
        System.out.println(fillOneDimensionalArrayCycle(array));
        System.out.println(fillOneDimensionalArrayRecursion(array, 0));
        fillTwoDimensionalArrayCycle();
    }
}
