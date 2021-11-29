package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax19To19Then19() {
        Max max = new Max();
        int result = max.max(19, 19);
        int expected = 19;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To5Then5() {
        Max max = new Max();
        int result = max.max(3, 4, 5);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To5to6Then6() {
        Max max = new Max();
        int result = max.max(3, 4, 5, 6);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To7To6to5Then8() {
        Max max = new Max();
        int result = max.max(8, 7, 6, 5);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To7To7to9Then9() {
        Max max = new Max();
        int result = max.max(7, 7, 7, 9);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}