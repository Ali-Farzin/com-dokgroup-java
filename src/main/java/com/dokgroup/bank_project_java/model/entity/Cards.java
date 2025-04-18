package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "\"Cards\"", schema = "Card")
public class Cards {
    @Id
    @Column(name = "\"CardUID\"", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"CardsTypeID\"", nullable = false)
    private com.dokgroup.bank_project_java.model.entity.CardsType cardsTypeID;

    @Column(name = "\"CardsStatus\"", nullable = false)
    private Integer cardsStatus;

    @Column(name = "\"CardsIsActive\"", nullable = false)
    private Boolean cardsIsActive = false;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    @OneToMany(mappedBy = "cardsUID")
    private Set<AccountsCards> accountsCards = new LinkedHashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public com.dokgroup.bank_project_java.model.entity.CardsType getCardsTypeID() {
        return cardsTypeID;
    }

    public void setCardsTypeID(com.dokgroup.bank_project_java.model.entity.CardsType cardsTypeID) {
        this.cardsTypeID = cardsTypeID;
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

    public Set<AccountsCards> getAccountsCards() {
        return accountsCards;
    }

    public void setAccountsCards(Set<AccountsCards> accountsCards) {
        this.accountsCards = accountsCards;
    }

}