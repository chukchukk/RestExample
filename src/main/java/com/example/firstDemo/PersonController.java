package com.example.firstDemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private Repository rep = new Repository();

    @GetMapping("/person")
    public Person getPerson(@RequestParam(value = "name", required = true) String name){
        return rep.personByName(name);
    }

    @PostMapping("/person")
    public Person personUpdate(@RequestParam(value = "name", required = true) String name,
                               @RequestParam(value = "age", required = true) int age){
        Person p = rep.personByName(name);

        if(p != null){
            p.setAge(age);
            return p;
        } else {
            return rep.addPerson(new Person(name, age));
        }

    }
}
