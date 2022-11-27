package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("given an empty integer array, return empty array")
    public void givenAnEmptyArrayShouldReturnSame() {
        int[] intArray = {};
        int[] expected = {};
        int[] result = Main.sortArray(intArray);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("given an integer array, return sorted array")
    public void givenAnArrayShouldSort() {
        int[] intArray = {5, 7, 3, 6, 4, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = Main.sortArray(intArray);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("given two integer arrays, return one merged sorted array")
    public void givenTwoArraysShouldAndReturnOneSortedArray() {
        int[] intArray1 = {5, 7, 3, 6, 4, 2, 1};
        int[] intArray2 = {11, 9, 13, 14, 12, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14};
        int[] result = Main.sortTwoArrays(intArray1, intArray2);
        assertArrayEquals(expected, result);
    }
}