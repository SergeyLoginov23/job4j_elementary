package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNew() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0},
                {1, 1, 3, 4}
        };
        int result = MatrixSum.sum(array);
        int expected = 16;
        Assert.assertEquals(expected, result);
    }
}