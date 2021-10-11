package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Petr", "Arsentev", "8647648769", "Bryansk"));
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}