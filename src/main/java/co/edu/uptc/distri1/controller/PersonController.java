package co.edu.uptc.distri1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.distri1.model.Person;

@RestController
@RequestMapping("/persona")

public class PersonController {
    @GetMapping()
    public Person getPersonRandom() {
        Person person = new Person();
        person.setName("Juan");
        person.setLastname("Horse");
        return person;
    }
}
