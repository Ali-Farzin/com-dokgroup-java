package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"CardsActionType\"", schema = "Card")
public class CardsActionType {
    @Id
    @Column(name = "\"CardsActionTypeID\"", nullable = false)
    private Long id;

    @Column(name = "\"CardsActionType\"", nullable = false, length = 100)
    private String cardsActionType;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    @OneToMany(mappedBy = "cardsActionTypeID")
    private Set<com.dokgroup.bank_project_java.model.entity.CardsPermits> cardsPermits = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardsActionType() {
        return cardsActionType;
    }

    public void setCardsActionType(String cardsActionType) {
        this.cardsActionType = cardsActionType;
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

    public Set<com.dokgroup.bank_project_java.model.entity.CardsPermits> getCardsPermits() {
        return cardsPermits;
    }

    public void setCardsPermits(Set<com.dokgroup.bank_project_java.model.entity.CardsPermits> cardsPermits) {
        this.cardsPermits = cardsPermits;
    }

}