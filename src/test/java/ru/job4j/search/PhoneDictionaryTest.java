package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Petr", "Arsentev", "8647648769", "Bryansk"));
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNotFind() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Petr", "Arsentev", "8647648769", "Bryansk"));
        ArrayList<Person> persons = phone.find("Aleks");
        assertTrue(persons.isEmpty());
    }

}