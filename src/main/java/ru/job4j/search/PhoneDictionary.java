package ru.job4j.search;
import java.util.ArrayList;
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (persons.getName().contains(key)
                    || persons.getSurname().contains(key)
                    || persons.getPhone().contains(key)
                    || persons.getAddress().contains(key)) {
                result.add(persons.get());
            }
            return result;
        }
        return result;
        }
    }