package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "\"Cards\"", schema = "Card")
public class Card {
    @Id
    @Column(name = "\"CardUID\"", nullable = false)
    private UUID id;

    @Column(name = "\"CardsStatus\"", nullable = false)
    private Integer cardsStatus;

    @Column(name = "\"CardsIsActive\"", nullable = false)
    private Boolean cardsIsActive = false;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getCardsStatus() {
        return cardsStatus;
    }

    public void setCardsStatus(Integer cardsStatus) {
        this.cardsStatus = cardsStatus;
    }

    public Boolean getCardsIsActive() {
        return cardsIsActive;
    }

    public void setCardsIsActive(Boolean cardsIsActive) {
        this.cardsIsActive = cardsIsActive;
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