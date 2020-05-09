package de.iteratec.mepic.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService {

    PeopleRepository repository;

    @Autowired
    public PersonService(PeopleRepository repository) {
        this.repository = repository;
    }

    public Person getPersonByUuid(UUID uuid) {
        return repository.findByUuid(uuid);
    }
}
