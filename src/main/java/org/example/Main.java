package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] emptyArray = {};
        int[] intArray1 = {5, 7, 3, 6, 4, 2, 1};
        int[] intArray2 = {11, 9, 13, 14, 12, 10};
        System.out.println(Arrays.toString(sortArray(emptyArray)));
        System.out.println(Arrays.toString(sortArray(intArray1)));
        System.out.println(Arrays.toString(sortTwoArrays(intArray1, intArray2)));
    }

    public static int[] sortArray(int[] myArray) {
        if (myArray.length == 0) {
            return myArray;
        }
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        return myArray;
    }

    public static int[] sortTwoArrays(int[] firstArray, int[] secondArray) {
        int[] myArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, myArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, myArray, firstArray.length, secondArray.length);
        return sortArray(myArray);
    }
}