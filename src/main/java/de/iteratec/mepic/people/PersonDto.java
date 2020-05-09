package de.iteratec.mepic.people;

import lombok.Data;

import java.util.UUID;

@Data
public class PersonDto {

    public PersonDto(UUID id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    UUID id;
    String firstname;
    String lastname;
}
