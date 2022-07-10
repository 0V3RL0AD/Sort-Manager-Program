package com.sparta.SortManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    MergeSort MS;

    @BeforeEach
    @Test
    void setUp() {
        MS = new MergeSort();
    }

    @Test
    @DisplayName("Bubble sort Test with 5 numbers")
    void Test5Number()
    {
        Assertions.assertEquals(4, (MS.sort(new int[]{5, 4, 69, 12, 24})[0]));
    }

    @Test
    @DisplayName("Merge sort Test with 10 numbers")
    void Test10Number()
    {
        Assertions.assertEquals(3, (MS.sort(new int[]{3, 5, 69, 12, 24, 72, 14, 35, 97, 1003})[0]));
    }

    @Test
    @DisplayName("Merge sort Test with 15 numbers")
    void Test15Number()
    {
        Assertions.assertEquals(8, (MS.sort(new int[]{43, 11, 69, 12, 24, 72, 14, 35, 97, 13, 8, 74, 456, 70, 51})[0]));
    }
}