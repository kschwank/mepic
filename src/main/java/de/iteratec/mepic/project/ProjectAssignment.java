package de.iteratec.mepic.project;

import de.iteratec.mepic.people.Person;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
public class ProjectAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @OneToOne
    private Project project;

    @OneToOne
    private Person person;

    private Date fromDate;

    private Date toDate;

    private Double hoursPerWeek;

    private Double probability;

    protected ProjectAssignment() {}

    public ProjectAssignment(Project project, Person person, Date fromDate, Date toDate, Double hoursPerWeek, Double probability) {
        this.project = project;
        this.person = person;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.hoursPerWeek = hoursPerWeek;
        this.probability = probability;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Project getProject() {
        return project;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public Double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public Double getProbability() {
        return probability;
    }
}
