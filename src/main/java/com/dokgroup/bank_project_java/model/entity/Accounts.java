package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
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
    private Short accountStatus;

    @Column(name = "\"AccountIsActive\"")
    private Boolean accountIsActive;

    @Column(name = "\"DatetimeCrt\"", nullable = false)
    private OffsetDateTime datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"CurrencyCode\"", nullable = false)
    private CountryCurrenceis currencyCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"BranchID\"")
    private Branchs branchID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"BranchTerminalID\"")
    private BranchTerminals branchTerminalID;

    @OneToMany
    private Set<AccountsCards> accountsCards = new LinkedHashSet<>();

    @OneToMany(mappedBy = "accountUID")
    private Set<AccountsOwner> accountsOwners = new LinkedHashSet<>();

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
        return accountStatus;
    }

    public void setAccountStatus(Short accountStatus) {
        this.accountStatus = accountStatus;
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

    public CountryCurrenceis getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CountryCurrenceis currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Branchs getBranchID() {
        return branchID;
    }

    public void setBranchID(Branchs branchID) {
        this.branchID = branchID;
    }

    public BranchTerminals getBranchTerminalID() {
        return branchTerminalID;
    }

    public void setBranchTerminalID(BranchTerminals branchTerminalID) {
        this.branchTerminalID = branchTerminalID;
    }

    public Set<AccountsCards> getAccountsCards() {
        return accountsCards;
    }

    public void setAccountsCards(Set<AccountsCards> accountsCards) {
        this.accountsCards = accountsCards;
    }

    public Set<AccountsOwner> getAccountsOwners() {
        return accountsOwners;
    }

    public void setAccountsOwners(Set<AccountsOwner> accountsOwners) {
        this.accountsOwners = accountsOwners;
    }

}