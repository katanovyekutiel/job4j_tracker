package ru.job4j.ex;

import junit.framework.TestCase;
import org.junit.Test;

public class FactTest extends TestCase {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        Fact.calc(-1);
    }
}