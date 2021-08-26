package ru.job4j.tracker;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getCreated(), is(expected.getCreated()));

    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), null};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item delete = tracker.findById(item.getId());
        assertThat(delete.getName(), is("null"));
    }
}