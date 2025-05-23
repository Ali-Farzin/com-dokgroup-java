package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Branchs\"", schema = "Comn")
public class Branchs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Branchs_id_gen")
    @SequenceGenerator(name = "Branchs_id_gen", sequenceName = "Branchs_BranchID_seq", allocationSize = 1)
    @Column(name = "\"BranchID\"", nullable = false)
    private Long id;

    @Column(name = "\"BranchCode\"", nullable = false, length = 25)
    private String branchCode;

    @Column(name = "\"BranchName\"", nullable = false, length = 25)
    private String branchName;

    @Column(name = "\"DtaetimeCrt\"", nullable = false)
    private OffsetDateTime dtaetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private OffsetDateTime datetimeEdt;

    @OneToMany(mappedBy = "branchID")
    private Set<Accounts> accounts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "branchID")
    private Set<BranchTerminals> branchTerminals = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public OffsetDateTime getDtaetimeCrt() {
        return dtaetimeCrt;
    }

    public void setDtaetimeCrt(OffsetDateTime dtaetimeCrt) {
        this.dtaetimeCrt = dtaetimeCrt;
    }

    public OffsetDateTime getDatetimeEdt() {
        return datetimeEdt;
    }

    public void setDatetimeEdt(OffsetDateTime datetimeEdt) {
        this.datetimeEdt = datetimeEdt;
    }

    public Set<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Accounts> accounts) {
        this.accounts = accounts;
    }

    public Set<BranchTerminals> getBranchTerminals() {
        return branchTerminals;
    }

    public void setBranchTerminals(Set<BranchTerminals> branchTerminals) {
        this.branchTerminals = branchTerminals;
    }

}