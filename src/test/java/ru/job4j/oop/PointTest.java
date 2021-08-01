package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {

    @Test
    public void when000to200then2() {
        double expected = 2;
        Point a = new Point(0,0,0);
        Point b = new Point(0, 0, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when200to200then0() {
        double expected1 = 0;
        Point a = new Point(2,0,0);
        Point b = new Point(2, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected1, out, 0.01);
    }

    @Test
    public void when200to000then2() {
        double expected2 = 2;
        Point a = new Point(2,0,0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected2, out, 0.01);
    }

    @Test
    public void when110to200then141() {
        double expected3 = 1.41;
        Point a = new Point(1,1,0);
        Point b = new Point(2, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected3, out, 0.01);
    }

}