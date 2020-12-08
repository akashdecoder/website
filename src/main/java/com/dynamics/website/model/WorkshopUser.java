package com.dynamics.website.model;

import javax.persistence.*;

@Entity
@Table
public class WorkshopUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = false)
    private long workshop_id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String year;

    @Column
    private String branch;

    @Column
    private String usn;

    @Column
    private String email;

    @Column
    private long contact;

    @Column
    private String event_name;

    public WorkshopUser() {
    }

    public WorkshopUser(long workshop_id, String firstName, String lastName, String year, String branch, String usn, String email, long contact, String event_name) {
        this.workshop_id = workshop_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.branch = branch;
        this.usn = usn;
        this.email = email;
        this.contact = contact;
        this.event_name = event_name;
    }

    public long getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(long workshop_id) {
        this.workshop_id = workshop_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }
}
