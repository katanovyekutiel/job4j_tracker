package ru.job4j.ex;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        new Fact().calc(-1);
    }

}