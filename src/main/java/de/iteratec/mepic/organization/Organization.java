package de.iteratec.mepic.organization;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String name;

    private String notes;

    @OneToMany
    private List<OrganizationAddress> addresses;

    protected Organization() {}

    public Organization(String name, List<OrganizationAddress> addresses, String notes) {
        this.name = name;
        this.addresses = addresses;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }
}
