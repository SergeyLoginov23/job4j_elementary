package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to20then1() {
        double expected = 1;
        int x1 = 2;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenM1M1to33then5dot66() {
        double expected = 5.66;
        int x1 = -1;
        int y1 = -1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}