package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "\"PersonsPart\"", schema = "Prsn")
public class PersonsPart {
    @Id
    @Column(name = "\"PersonUID\"", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"PersonID\"", nullable = false)
    private PersonsAll personID;

    @Column(name = "\"PartnershipType\"", nullable = false, length = 50)
    private String partnershipType;

    @Column(name = "\"PartnershipName\"", nullable = false, length = 100)
    private String partnershipName;

    @Column(name = "\"EstabilishDate\"")
    private LocalDate estabilishDate;

    @Column(name = "\"PartRegisterNo\"", length = 25)
    private String partRegisterNo;

    @Column(name = "\"NationalityId\"")
    private Integer nationalityId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    @OneToMany(mappedBy = "personUID")
    private Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> personsPartShares = new LinkedHashSet<>();

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

    public String getPartnershipType() {
        return partnershipType;
    }

    public void setPartnershipType(String partnershipType) {
        this.partnershipType = partnershipType;
    }

    public String getPartnershipName() {
        return partnershipName;
    }

    public void setPartnershipName(String partnershipName) {
        this.partnershipName = partnershipName;
    }

    public LocalDate getEstabilishDate() {
        return estabilishDate;
    }

    public void setEstabilishDate(LocalDate estabilishDate) {
        this.estabilishDate = estabilishDate;
    }

    public String getPartRegisterNo() {
        return partRegisterNo;
    }

    public void setPartRegisterNo(String partRegisterNo) {
        this.partRegisterNo = partRegisterNo;
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

    public Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> getPersonsPartShares() {
        return personsPartShares;
    }

    public void setPersonsPartShares(Set<com.dokgroup.bank_project_java.model.entity.PersonsPartShare> personsPartShares) {
        this.personsPartShares = personsPartShares;
    }

}