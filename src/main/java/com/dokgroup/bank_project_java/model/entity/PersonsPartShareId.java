package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class PersonsPartShareId implements java.io.Serializable {
    private static final long serialVersionUID = -4391881914803923533L;
    @Column(name = "\"PersonID\"", nullable = false)
    private Long personID;

    @Column(name = "\"PersonUID\"", nullable = false)
    private UUID personUID;

    // Getters & Setters
    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public UUID getPersonUID() {
        return personUID;
    }

    public void setPersonUID(UUID personUID) {
        this.personUID = personUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonsPartShareId entity = (PersonsPartShareId) o;
        return Objects.equals(this.personUID, entity.personUID) &&
                Objects.equals(this.personID, entity.personID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personUID, personID);
    }

}