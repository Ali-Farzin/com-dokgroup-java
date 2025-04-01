package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "\"PersonsPartShare\"", schema = "Prsn")
public class PersonsPartShare {
    @EmbeddedId
    private PersonsPartShareId id;

    @MapsId("personID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"PersonID\"", nullable = false)
    private PersonsAll personID;

    @MapsId("personUID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"PersonUID\"", nullable = false)
    private PersonsPart personUID;

    @ColumnDefault("1")
    @Column(name = "\"ShareOfPartnership\"", nullable = false, precision = 9, scale = 8)
    private BigDecimal shareOfPartnership;

    @Column(name = "\"IsAddable\"", nullable = false)
    private Boolean isAddable = false;

    @Column(name = "\"IsVwable\"")
    private Boolean isVwable;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    public PersonsPartShareId getId() {
        return id;
    }

    public void setId(PersonsPartShareId id) {
        this.id = id;
    }

    public PersonsAll getPersonID() {
        return personID;
    }

    public void setPersonID(PersonsAll personID) {
        this.personID = personID;
    }

    public PersonsPart getPersonUID() {
        return personUID;
    }

    public void setPersonUID(PersonsPart personUID) {
        this.personUID = personUID;
    }

    public BigDecimal getShareOfPartnership() {
        return shareOfPartnership;
    }

    public void setShareOfPartnership(BigDecimal shareOfPartnership) {
        this.shareOfPartnership = shareOfPartnership;
    }

    public Boolean getIsAddable() {
        return isAddable;
    }

    public void setIsAddable(Boolean isAddable) {
        this.isAddable = isAddable;
    }

    public Boolean getIsVwable() {
        return isVwable;
    }

    public void setIsVwable(Boolean isVwable) {
        this.isVwable = isVwable;
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