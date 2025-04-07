package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

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

    // Getters & Setters
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

}