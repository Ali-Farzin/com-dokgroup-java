package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"AccountsActionType\"", schema = "Acnt")
public class AccountsActionType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountsActionType_id_gen")
    @SequenceGenerator(name = "AccountsActionType_id_gen", sequenceName = "AccountsActionType_AccountsActionTypeID_seq", allocationSize = 1)
    @Column(name = "\"AccountsActionTypeID\"", nullable = false)
    private Long id;

    @Column(name = "\"AccountsActionType\"", nullable = false, length = 100)
    private String accountsActionType;

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

    public String getAccountsActionType() {
        return accountsActionType;
    }

    public void setAccountsActionType(String accountsActionType) {
        this.accountsActionType = accountsActionType;
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