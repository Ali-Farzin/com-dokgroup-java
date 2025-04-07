package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"CardsType\"", schema = "Card")
public class CardsType {
    @Id
    @SequenceGenerator(name = "CardsType_id_gen", sequenceName = "CardsType_CardsTypeID_seq", allocationSize = 1)
    @Column(name = "\"CardsTypeID\"", nullable = false)
    private Short id;

    @Column(name = "\"CardsType\"", nullable = false, length = Integer.MAX_VALUE)
    private String cardsType;

    @Column(name = "\"CardsTypeStatus\"", nullable = false)
    private Integer cardsTypeStatus;

    @Column(name = "\"CardsTypeIsActive\"", nullable = false)
    private Boolean cardsTypeIsActive = false;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    // Getters & Setters
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCardsType() {
        return cardsType;
    }

    public void setCardsType(String cardsType) {
        this.cardsType = cardsType;
    }

    public Integer getCardsTypeStatus() {
        return cardsTypeStatus;
    }

    public void setCardsTypeStatus(Integer cardsTypeStatus) {
        this.cardsTypeStatus = cardsTypeStatus;
    }

    public Boolean getCardsTypeIsActive() {
        return cardsTypeIsActive;
    }

    public void setCardsTypeIsActive(Boolean cardsTypeIsActive) {
        this.cardsTypeIsActive = cardsTypeIsActive;
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