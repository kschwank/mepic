package de.iteratec.mepic.organization;

import javax.persistence.*;

@Entity
public class OrganizationAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Organization organization;

    private String street;

    private String zipcode;

    private String town;

    private String country;

    private String phone;

    private String fax;

    private String email;

    protected OrganizationAddress() {}

    public OrganizationAddress(Organization organization,
                               String street,
                               String zipcode,
                               String town,
                               String country,
                               String phone,
                               String fax,
                               String email) {
        this.organization = organization;
        this.street = street;
        this.zipcode = zipcode;
        this.town = town;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Organization getOrganization() {
        return organization;
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

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }
}
