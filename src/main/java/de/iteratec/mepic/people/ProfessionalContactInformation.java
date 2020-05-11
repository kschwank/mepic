package de.iteratec.mepic.people;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class ProfessionalContactInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String street;

    private String zipcode;

    private String town;

    private String country;

    private String phone;

    private String mobile;

    private String fax;

    private String email;

    private String notes;

    protected ProfessionalContactInformation() {}

    private ProfessionalContactInformation(String street, String zipcode, String town, String country, String phone, String mobile, String fax, String email, String notes) {
        this.street = street;
        this.zipcode = zipcode;
        this.town = town;
        this.country = country;
        this.phone = phone;
        this.mobile = mobile;
        this.fax = fax;
        this.email = email;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getTown() {
        return town;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes() {
        return notes;
    }
}
