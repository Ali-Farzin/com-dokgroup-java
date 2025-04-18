package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"AccountsCards\"", schema = "Acnt")
public class AccountsCards {
    @EmbeddedId
    private AccountsCardsId id;

    @MapsId("accountUID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"AccountUID\"", nullable = false)
    private Accounts accountUID;

    @MapsId("cardsUID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"CardsUID\"", nullable = false)
    private com.dokgroup.bank_project_java.model.entity.Cards cardsUID;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    public AccountsCardsId getId() {
        return id;
    }

    public void setId(AccountsCardsId id) {
        this.id = id;
    }

    public Accounts getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(Accounts accountUID) {
        this.accountUID = accountUID;
    }

    public com.dokgroup.bank_project_java.model.entity.Cards getCardsUID() {
        return cardsUID;
    }

    public void setCardsUID(com.dokgroup.bank_project_java.model.entity.Cards cardsUID) {
        this.cardsUID = cardsUID;
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