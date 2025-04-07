package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"AccountsCards\"", schema = "Acnt")
public class AccountsCards {
    @SequenceGenerator(name = "AccountsCards_id_gen", sequenceName = "AccountsActionType_AccountsActionTypeID_seq", allocationSize = 1)
    @EmbeddedId
    private AccountsCardsId id;

    @MapsId("accountUID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"AccountUID\"", nullable = false)
    private Accounts accountUID;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    // Getters & Setters
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