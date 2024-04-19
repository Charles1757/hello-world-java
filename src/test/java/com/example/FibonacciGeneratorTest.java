package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonacciGeneratorTest {

    @Test
    public void testGenerateFibonacciSeries_ZeroElements() {
        assertEquals(Collections.emptyList(), FibonacciGenerator.generateFibonacciSeries(0));
    }

    @Test
    public void testGenerateFibonacciSeries_OneElement() {
        assertEquals(Collections.singletonList(0), FibonacciGenerator.generateFibonacciSeries(1));
    }

    @Test
    public void testGenerateFibonacciSeries_TwoElements() {
        assertEquals(Arrays.asList(0, 1), FibonacciGenerator.generateFibonacciSeries(2));
    }

    @Test
    public void testGenerateFibonacciSeries_TenElements() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals(expected, FibonacciGenerator.generateFibonacciSeries(10));
    }

    @Test
    public void testGenerateFibonacciSeries_NegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciGenerator.generateFibonacciSeries(-1));
    }
}