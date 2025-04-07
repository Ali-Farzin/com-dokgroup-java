package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "\"BranchTerminals\"", schema = "Comn")
public class BranchTerminals {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BranchTerminals_id_gen")
    @SequenceGenerator(name = "BranchTerminals_id_gen", sequenceName = "BranchTerminals_BranchTerminalID_seq", allocationSize = 1)
    @Column(name = "\"BranchTerminalID\"", nullable = false)
    private Long id;

    @Column(name = "\"BranchTerminalCode\"", length = 25)
    private String branchTerminalCode;

    @Column(name = "\"BranchTerminalName\"", length = 50)
    private String branchTerminalName;

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

    public String getBranchTerminalCode() {
        return branchTerminalCode;
    }

    public void setBranchTerminalCode(String branchTerminalCode) {
        this.branchTerminalCode = branchTerminalCode;
    }

    public String getBranchTerminalName() {
        return branchTerminalName;
    }

    public void setBranchTerminalName(String branchTerminalName) {
        this.branchTerminalName = branchTerminalName;
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