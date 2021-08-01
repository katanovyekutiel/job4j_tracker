package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Max;

public class MaxTest {

    @Test
    public void when1And2Max2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1And2And3Max3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}