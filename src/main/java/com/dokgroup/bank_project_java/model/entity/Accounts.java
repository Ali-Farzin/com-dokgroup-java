package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "\"Accounts\"", schema = "Acnt")
public class Accounts {
    @Id
    @Column(name = "\"AccountUID\"", nullable = false)
    private UUID id;

    @Column(name = "\"AccountNo\"", nullable = false, length = 25)
    private String accountNo;

    @Column(name = "\"AccountType\"", nullable = false)
    private Integer accountType;

    @Column(name = "\"OpenDate\"")
    private LocalDate openDate;

    @Column(name = "\"AccountStatus\"")
    private Short AccountStatus;

    @Column(name = "\"AccountIsActive\"")
    private Boolean accountIsActive;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    // Getters & Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public Short getAccountStatus() {
        return null;
    }

    public void setAccountStatus(Short accountStatus) {
//        this.accountStatus = accountStatus;
    }

    public Boolean getAccountIsActive() {
        return accountIsActive;
    }

    public void setAccountIsActive(Boolean accountIsActive) {
        this.accountIsActive = accountIsActive;
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