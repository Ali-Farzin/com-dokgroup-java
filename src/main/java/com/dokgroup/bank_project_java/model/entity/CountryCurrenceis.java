package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "\"CountryCurrenceis\"", schema = "Comn")
public class CountryCurrenceis {
    @Id
    @SequenceGenerator(name = "CountryCurrenceis_id_gen", sequenceName = "CardsType_CardsTypeID_seq", allocationSize = 1)
    @Column(name = "\"CurrencyCode\"", nullable = false, length = 6)
    private String currencyCode;

    @Column(name = "\"CurrencyName\"", nullable = false, length = 50)
    private String currencyName;

    @ColumnDefault("NULL")
    @Column(name = "\"CountryCode\"", length = 3)
    private String countryCode;

    @Column(name = "\"IsAddable\"", nullable = false)
    private Boolean isAddable = false;

    @Column(name = "\"IsVwable\"")
    private Boolean isVwable;

    @Column(name = "\"DatetimeCrt\"")
    private Instant datetimeCrt;

    @Column(name = "\"DatetimeEdt\"")
    private Instant datetimeEdt;

    // Getters & Setters
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getIsAddable() {
        return isAddable;
    }

    public void setIsAddable(Boolean isAddable) {
        this.isAddable = isAddable;
    }

    public Boolean getIsVwable() {
        return isVwable;
    }

    public void setIsVwable(Boolean isVwable) {
        this.isVwable = isVwable;
    }

    public Instant getDatetimeCrt() {
        return datetimeCrt;
    }

    public void setDatetimeCrt(Instant datetimeCrt) {
        this.datetimeCrt = datetimeCrt;
    }

    public Instant getDatetimeEdt() {
        return datetimeEdt;
    }

    public void setDatetimeEdt(Instant datetimeEdt) {
        this.datetimeEdt = datetimeEdt;
    }

}