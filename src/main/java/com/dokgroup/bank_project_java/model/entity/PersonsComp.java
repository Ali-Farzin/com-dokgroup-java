package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "\"PersonsComp\"", schema = "Prsn")
public class PersonsComp {
    @Id
    @Column(name = "\"PersonUID\"", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"PersonID\"", nullable = false)
    private PersonsAll personID;

    @Column(name = "\"CompanyType\"", nullable = false, length = 50)
    private String companyType;

    @Column(name = "\"CompanyName\"", nullable = false, length = 100)
    private String companyName;

    @Column(name = "\"EstabilishDate\"")
    private LocalDate estabilishDate;

    @Column(name = "\"CoRegisterNo\"", length = 25)
    private String coRegisterNo;

    @Column(name = "\"NationalityId\"")
    private Integer nationalityId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    // Getters & Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PersonsAll getPersonID() {
        return personID;
    }

    public void setPersonID(PersonsAll personID) {
        this.personID = personID;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getEstabilishDate() {
        return estabilishDate;
    }

    public void setEstabilishDate(LocalDate estabilishDate) {
        this.estabilishDate = estabilishDate;
    }

    public String getCoRegisterNo() {
        return coRegisterNo;
    }

    public void setCoRegisterNo(String coRegisterNo) {
        this.coRegisterNo = coRegisterNo;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    public OffsetDateTime getDatetimeCrt() {
        return datetimeCrt;
    }

    public void setDatetimeCrt(OffsetDateTime datetimeCrt) {
        this.datetimeCrt = datetimeCrt;
    }

    public OffsetDateTime getDatetimeEdt() {
        return datetimeEdt;
    }

    public void setDatetimeEdt(OffsetDateTime datetimeEdt) {
        this.datetimeEdt = datetimeEdt;
    }

}