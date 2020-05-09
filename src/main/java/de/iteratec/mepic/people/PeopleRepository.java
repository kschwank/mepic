package de.iteratec.mepic.people;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PeopleRepository extends CrudRepository<Person, Long> {

    Person findById(int id);
    Person findByUuid(UUID uuid);
}
