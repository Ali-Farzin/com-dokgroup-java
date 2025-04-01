package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "\"PersonsAll\"", schema = "Prsn")
public class PersonsAll {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PersonsAll_id_gen")
    @SequenceGenerator(name = "PersonsAll_id_gen", sequenceName = "PersonsAll_PersonID_seq", allocationSize = 1)
    @Column(name = "\"PersonID\"", nullable = false)
    private Long id;

    @Column(name = "\"PersonType\"", nullable = false)
    private Short personType;

    @Column(name = "\"PersonStatus\"")
    private Short personStatus;

    @ColumnDefault("false")
    @Column(name = "\"PersonIsActive\"")
    private Boolean personIsActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getPersonType() {
        return personType;
    }

    public void setPersonType(Short personType) {
        this.personType = personType;
    }

    public Short getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(Short personStatus) {
        this.personStatus = personStatus;
    }

    public Boolean getPersonIsActive() {
        return personIsActive;
    }

    public void setPersonIsActive(Boolean personIsActive) {
        this.personIsActive = personIsActive;
    }

}