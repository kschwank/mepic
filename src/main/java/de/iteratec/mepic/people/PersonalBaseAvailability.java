package de.iteratec.mepic.people;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class PersonalBaseAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date fromDate;

    private Date toDate;

    private Long dailyAvailability;

    protected PersonalBaseAvailability() {}

    public PersonalBaseAvailability(Date fromDate, Date toDate, Long dailyAvailability) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.dailyAvailability = dailyAvailability;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public Long getDailyAvailability() {
        return dailyAvailability;
    }
}
