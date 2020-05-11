package de.iteratec.mepic.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService {

    PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person getPersonByUuid(UUID uuid) {
        return repository.findByUuid(uuid);
    }
}
