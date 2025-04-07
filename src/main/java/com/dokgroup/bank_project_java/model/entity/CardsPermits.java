package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "\"CardsPermits\"", schema = "Card")
public class CardsPermits {
    @EmbeddedId
    private CardsPermitsId id;

    @MapsId("cardsActionTypeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"CardsActionTypeID\"", nullable = false)
    private CardsActionType cardsActionTypeID;

    @Column(name = "\"CardsPermitsStatus\"", nullable = false)
    private Integer cardsPermitsStatus;

    @ColumnDefault("true")
    @Column(name = "\"CardsPermitsIsActive\"", nullable = false)
    private Boolean cardsPermitsIsActive = false;

    @Column(name = "\"CardsPermitsFloorAmount\"")
    private BigDecimal cardsPermitsFloorAmount;

    @Column(name = "\"CardsPermitsCeilingAmount\"")
    private BigDecimal cardsPermitsCeilingAmount;

    @Column(name = "\"CardsPermitsFloorDatetime\"")
    private OffsetDateTime cardsPermitsFloorDatetime;

    @Column(name = "\"CardsPermitsCeilingDatetime\"")
    private OffsetDateTime cardsPermitsCeilingDatetime;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    // Getters & Setters
    public CardsPermitsId getId() {
        return id;
    }

    public void setId(CardsPermitsId id) {
        this.id = id;
    }

    public CardsActionType getCardsActionTypeID() {
        return cardsActionTypeID;
    }

    public void setCardsActionTypeID(CardsActionType cardsActionTypeID) {
        this.cardsActionTypeID = cardsActionTypeID;
    }

    public Integer getCardsPermitsStatus() {
        return cardsPermitsStatus;
    }

    public void setCardsPermitsStatus(Integer cardsPermitsStatus) {
        this.cardsPermitsStatus = cardsPermitsStatus;
    }

    public Boolean getCardsPermitsIsActive() {
        return cardsPermitsIsActive;
    }

    public void setCardsPermitsIsActive(Boolean cardsPermitsIsActive) {
        this.cardsPermitsIsActive = cardsPermitsIsActive;
    }

    public BigDecimal getCardsPermitsFloorAmount() {
        return cardsPermitsFloorAmount;
    }

    public void setCardsPermitsFloorAmount(BigDecimal cardsPermitsFloorAmount) {
        this.cardsPermitsFloorAmount = cardsPermitsFloorAmount;
    }

    public BigDecimal getCardsPermitsCeilingAmount() {
        return cardsPermitsCeilingAmount;
    }

    public void setCardsPermitsCeilingAmount(BigDecimal cardsPermitsCeilingAmount) {
        this.cardsPermitsCeilingAmount = cardsPermitsCeilingAmount;
    }

    public OffsetDateTime getCardsPermitsFloorDatetime() {
        return cardsPermitsFloorDatetime;
    }

    public void setCardsPermitsFloorDatetime(OffsetDateTime cardsPermitsFloorDatetime) {
        this.cardsPermitsFloorDatetime = cardsPermitsFloorDatetime;
    }

    public OffsetDateTime getCardsPermitsCeilingDatetime() {
        return cardsPermitsCeilingDatetime;
    }

    public void setCardsPermitsCeilingDatetime(OffsetDateTime cardsPermitsCeilingDatetime) {
        this.cardsPermitsCeilingDatetime = cardsPermitsCeilingDatetime;
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