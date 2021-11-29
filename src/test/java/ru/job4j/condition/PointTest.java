package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to20then1() {
        double expected = 1;
        Point a = new Point(2, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1Mto33then5dot66() {
        double expected = 5.66;
        Point a = new Point(-1, -1);
        Point b = new Point(3, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to333then3dot46() {
        double expected = 3.46;
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when212to454then4dot89() {
        double expected = 4.89;
        Point a = new Point(2, 1, 2);
        Point b = new Point(4, 5, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}