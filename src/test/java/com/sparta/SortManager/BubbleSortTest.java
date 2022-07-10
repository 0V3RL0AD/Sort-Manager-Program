package com.sparta.SortManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort BS;
    @BeforeEach
    @Test
    void setUp() {
        BS = new BubbleSort();
    }

    @Test
    @DisplayName("Bubble sort Test with 5 numbers")
    void Test5Number()
    {
        Assertions.assertEquals(4, (BS.sort(new int[]{4, 5, 69, 12, 24})[0]));
    }

    @Test
    @DisplayName("Bubble sort Test with 10 numbers")
    void Test10Number()
    {
        Assertions.assertEquals(3, (BS.sort(new int[]{7, 5, 69, 12, 24, 72, 14, 35, 3, 1003})[0]));
    }

    @Test
    @DisplayName("Bubble sort Test with 15 numbers")
    void Test15Number()
    {
        Assertions.assertEquals(8, (BS.sort(new int[]{43, 11, 69, 12, 24, 72, 14, 35, 97, 13, 8, 74, 456, 70, 51})[0]));
    }
}