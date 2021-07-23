package org.sergeyzhirkov.switchme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortArrayTest {
    @Test
    public void testSortAsc() {
        Integer[] inputArray = {1, 2, 0, 6, 5, 3, 100500, 1};
        Integer[] expectedArray = {0, 1, 1, 2, 3, 5, 6, 100500};
        Integer[] resultArray = Utils.sortArray(inputArray, Utils.Order.ASC);
        Assertions.assertTrue(Arrays.equals(expectedArray, resultArray));
    }

    @Test
    public void testSortDesc() {
        Integer[] inputArray = {1, 2, 0, 6, 5, 3, -100500, -2, 100500, 1};
        Integer[] expectedArray = {100500, 6, 5, 3, 2, 1, 1, 0, -2, -100500};
        Integer[] resultArray = Utils.sortArray(inputArray, Utils.Order.DESC);
        Assertions.assertTrue(Arrays.equals(expectedArray, resultArray));
    }

    @Test
    public void testSortEmpty() {
        Integer[] inputArray = {};
        Integer[] expectedArray = {};
        Integer[] resultArray = Utils.sortArray(inputArray, Utils.Order.DESC);
        Assertions.assertTrue(Arrays.equals(expectedArray, resultArray));
    }

    @Test
    public void testSortNull() {
        Assertions.assertThrows(NullPointerException.class, () -> Utils.sortArray(null, Utils.Order.ASC));
    }


}
