package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"AccountsCards\"", schema = "Acnt")
public class AccountsCard {
    @SequenceGenerator(name = "AccountsCards_id_gen", sequenceName = "AccountsActionType_AccountsActionTypeID_seq", allocationSize = 1)
    @EmbeddedId
    private AccountsCardId id;

    @MapsId("accountUID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"AccountUID\"", nullable = false)
    private Account accountUID;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    public AccountsCardId getId() {
        return id;
    }

    public void setId(AccountsCardId id) {
        this.id = id;
    }

    public Account getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(Account accountUID) {
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