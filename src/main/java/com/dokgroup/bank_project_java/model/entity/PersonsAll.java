package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "personID")
    private Set<AccountsOwner> accountsOwners = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    private Set<com.dokgroup.bank_project_java.model.entity.PersonsComp> personsComps = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    private Set<com.dokgroup.bank_project_java.model.entity.PersonsPart> personsParts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    private Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> personsPartShares = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    private Set<com.dokgroup.bank_project_java.model.entity.PersonsReal> personsReals = new LinkedHashSet<>();

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

    public Set<AccountsOwner> getAccountsOwners() {
        return accountsOwners;
    }

    public void setAccountsOwners(Set<AccountsOwner> accountsOwners) {
        this.accountsOwners = accountsOwners;
    }

    public Set<com.dokgroup.bank_project_java.model.entity.PersonsComp> getPersonsComps() {
        return personsComps;
    }

    public void setPersonsComps(Set<com.dokgroup.bank_project_java.model.entity.PersonsComp> personsComps) {
        this.personsComps = personsComps;
    }

    public Set<com.dokgroup.bank_project_java.model.entity.PersonsPart> getPersonsParts() {
        return personsParts;
    }

    public void setPersonsParts(Set<com.dokgroup.bank_project_java.model.entity.PersonsPart> personsParts) {
        this.personsParts = personsParts;
    }

    public Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> getPersonsPartShares() {
        return personsPartShares;
    }

    public void setPersonsPartShares(Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> personsPartShares) {
        this.personsPartShares = personsPartShares;
    }

    public Set<com.dokgroup.bank_project_java.model.entity.PersonsReal> getPersonsReals() {
        return personsReals;
    }

    public void setPersonsReals(Set<com.dokgroup.bank_project_java.model.entity.PersonsReal> personsReals) {
        this.personsReals = personsReals;
    }

}