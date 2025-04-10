package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "\"AccountsOwner\"", schema = "Acnt")
public class AccountsOwner {
    @Id
    @Column(name = "\"AccountsOwnerUID\"", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"AccountUID\"", nullable = false)
    private Account accountUID;

    @Column(name = "\"AccountsOwnerStatus\"", nullable = false)
    private Integer accountsOwnerStatus;

    @Column(name = "\"AccountsOwnerIsActive\"", nullable = false)
    private Boolean accountsOwnerIsActive = false;

    @Column(name = "\"SignOfOwner\"")
    private byte[] signOfOwner;

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

    public Account getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(Account accountUID) {
        this.accountUID = accountUID;
    }

    public Integer getAccountsOwnerStatus() {
        return accountsOwnerStatus;
    }

    public void setAccountsOwnerStatus(Integer accountsOwnerStatus) {
        this.accountsOwnerStatus = accountsOwnerStatus;
    }

    public Boolean getAccountsOwnerIsActive() {
        return accountsOwnerIsActive;
    }

    public void setAccountsOwnerIsActive(Boolean accountsOwnerIsActive) {
        this.accountsOwnerIsActive = accountsOwnerIsActive;
    }

    public byte[] getSignOfOwner() {
        return signOfOwner;
    }

    public void setSignOfOwner(byte[] signOfOwner) {
        this.signOfOwner = signOfOwner;
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