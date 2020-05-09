package de.iteratec.mepic.people;

import de.iteratec.mepic.organization.Organization;
import de.iteratec.mepic.organization.OrganizationPosition;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String firstname;
    private String lastname;

    @ManyToOne
    private Organization organization;

    @OneToOne
    private OrganizationPosition position;

    protected Person() {}

    public Person(String firstname, String lastname, Organization organization, OrganizationPosition position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.organization = organization;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Person[id=%d, uuid=%s, firstname=%s, lastname=%s, organization=%s, position=%s",
                id, uuid.toString(), firstname, lastname, organization, position);
    }

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
