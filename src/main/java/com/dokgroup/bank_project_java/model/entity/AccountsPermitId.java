package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class AccountsPermitId implements java.io.Serializable {
    private static final long serialVersionUID = 781098708698420624L;
    @Column(name = "\"AccountUID\"", nullable = false)
    private UUID accountUID;

    @Column(name = "\"AccountsActionTypeID\"", nullable = false)
    private Long accountsActionTypeID;

    public UUID getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(UUID accountUID) {
        this.accountUID = accountUID;
    }

    public Long getAccountsActionTypeID() {
        return accountsActionTypeID;
    }

    public void setAccountsActionTypeID(Long accountsActionTypeID) {
        this.accountsActionTypeID = accountsActionTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountsPermitId entity = (AccountsPermitId) o;
        return Objects.equals(this.accountUID, entity.accountUID) &&
                Objects.equals(this.accountsActionTypeID, entity.accountsActionTypeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountUID, accountsActionTypeID);
    }

}