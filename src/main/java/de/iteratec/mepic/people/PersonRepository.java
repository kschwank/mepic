package de.iteratec.mepic.people;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findById(int id);
    Person findByUuid(UUID uuid);
    Person findAllByFirstnameContainsOrLastnameContainsOrOrganizationContains(String s1, String s2, String s3);
}
