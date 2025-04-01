package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "\"AccountsPermits\"", schema = "Acnt")
public class AccountsPermit {
    @EmbeddedId
    private AccountsPermitId id;

    @MapsId("accountsActionTypeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"AccountsActionTypeID\"", nullable = false)
    private AccountsActionType accountsActionTypeID;

    @Column(name = "\"AccountsPermitsStatus\"", nullable = false)
    private Integer accountsPermitsStatus;

    @ColumnDefault("true")
    @Column(name = "\"AccountsPermitsIsActive\"", nullable = false)
    private Boolean accountsPermitsIsActive = false;

    @Column(name = "\"AccountsPermitsFloorAmount\"")
    private BigDecimal accountsPermitsFloorAmount;

    @Column(name = "\"AccountsPermitsCeilingAmount\"")
    private BigDecimal accountsPermitsCeilingAmount;

    @Column(name = "\"AccountsPermitsFloorDatetime\"")
    private OffsetDateTime accountsPermitsFloorDatetime;

    @Column(name = "\"AccountsPermitsCeilingDatetime\"")
    private OffsetDateTime accountsPermitsCeilingDatetime;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    public AccountsPermitId getId() {
        return id;
    }

    public void setId(AccountsPermitId id) {
        this.id = id;
    }

    public AccountsActionType getAccountsActionTypeID() {
        return accountsActionTypeID;
    }

    public void setAccountsActionTypeID(AccountsActionType accountsActionTypeID) {
        this.accountsActionTypeID = accountsActionTypeID;
    }

    public Integer getAccountsPermitsStatus() {
        return accountsPermitsStatus;
    }

    public void setAccountsPermitsStatus(Integer accountsPermitsStatus) {
        this.accountsPermitsStatus = accountsPermitsStatus;
    }

    public Boolean getAccountsPermitsIsActive() {
        return accountsPermitsIsActive;
    }

    public void setAccountsPermitsIsActive(Boolean accountsPermitsIsActive) {
        this.accountsPermitsIsActive = accountsPermitsIsActive;
    }

    public BigDecimal getAccountsPermitsFloorAmount() {
        return accountsPermitsFloorAmount;
    }

    public void setAccountsPermitsFloorAmount(BigDecimal accountsPermitsFloorAmount) {
        this.accountsPermitsFloorAmount = accountsPermitsFloorAmount;
    }

    public BigDecimal getAccountsPermitsCeilingAmount() {
        return accountsPermitsCeilingAmount;
    }

    public void setAccountsPermitsCeilingAmount(BigDecimal accountsPermitsCeilingAmount) {
        this.accountsPermitsCeilingAmount = accountsPermitsCeilingAmount;
    }

    public OffsetDateTime getAccountsPermitsFloorDatetime() {
        return accountsPermitsFloorDatetime;
    }

    public void setAccountsPermitsFloorDatetime(OffsetDateTime accountsPermitsFloorDatetime) {
        this.accountsPermitsFloorDatetime = accountsPermitsFloorDatetime;
    }

    public OffsetDateTime getAccountsPermitsCeilingDatetime() {
        return accountsPermitsCeilingDatetime;
    }

    public void setAccountsPermitsCeilingDatetime(OffsetDateTime accountsPermitsCeilingDatetime) {
        this.accountsPermitsCeilingDatetime = accountsPermitsCeilingDatetime;
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