package com.example.firstDemo;

import java.util.Hashtable;
import java.util.Map;

public class Repository {
    static Map<String, Person> persons = new Hashtable<>();

    static {
        persons.put("Денис", new Person("Денис", 19));
        persons.put("Александр", new Person("Александр", 18));
        persons.put("Владимир", new Person("Владимир", 20));
    }

    public Person personByName(String name){
        return persons.get(name);
    }

    public Person addPerson(Person p){
        persons.put(p.getName(), p);
        return p;
    }
}
