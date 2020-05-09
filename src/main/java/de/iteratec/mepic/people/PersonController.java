package de.iteratec.mepic.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PersonController {

    PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/person/{idstr}")
    public PersonDto getPerson(@PathVariable String idstr) {
        UUID uuid = UUID.fromString(idstr);
        Person person = service.getPersonByUuid(uuid);
        return new PersonDto(person.getUuid(), person.getFirstname(), person.getLastname());
    }
}
