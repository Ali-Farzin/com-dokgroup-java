package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class AccountsCardId implements java.io.Serializable {
    private static final long serialVersionUID = 8261044010152228742L;
    @Column(name = "\"AccountUID\"", nullable = false)
    private UUID accountUID;

    @Column(name = "\"CardsUID\"", nullable = false)
    private UUID cardsUID;

    public UUID getAccountUID() {
        return accountUID;
    }

    public void setAccountUID(UUID accountUID) {
        this.accountUID = accountUID;
    }

    public UUID getCardsUID() {
        return cardsUID;
    }

    public void setCardsUID(UUID cardsUID) {
        this.cardsUID = cardsUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountsCardId entity = (AccountsCardId) o;
        return Objects.equals(this.cardsUID, entity.cardsUID) &&
                Objects.equals(this.accountUID, entity.accountUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardsUID, accountUID);
    }

}