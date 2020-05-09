package de.iteratec.mepic.project;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String shortDescription;

    private String description;

    @OneToOne
    private ProjectType type;

    protected Project() {}

    public Project(String shortDescription, String description, ProjectType type) {
        this.shortDescription = shortDescription;
        this.description = description;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ProjectType getType() {
        return type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }
}
