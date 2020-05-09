package de.iteratec.mepic.people;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PersonalAbsence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date fromDate;

    private Date toDate;

    private Long dailyReducedMinutes;

    protected PersonalAbsence() {}

    public PersonalAbsence(Date fromDate, Date toDate, Long dailyReducedMinutes) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.dailyReducedMinutes = dailyReducedMinutes;
    }

    public Long getId() {
        return id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public Long getDailyReducedMinutes() {
        return dailyReducedMinutes;
    }
}
