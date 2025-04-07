package com.dokgroup.bank_project_java.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class CardsPermitsId implements java.io.Serializable {
    private static final long serialVersionUID = -6845288516873617768L;
    @Column(name = "\"CardUID\"", nullable = false)
    private UUID cardUID;

    @Column(name = "\"CardsActionTypeID\"", nullable = false)
    private Long cardsActionTypeID;

    // Getters & Setters
    public UUID getCardUID() {
        return cardUID;
    }

    public void setCardUID(UUID cardUID) {
        this.cardUID = cardUID;
    }

    public Long getCardsActionTypeID() {
        return cardsActionTypeID;
    }

    public void setCardsActionTypeID(Long cardsActionTypeID) {
        this.cardsActionTypeID = cardsActionTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CardsPermitsId entity = (CardsPermitsId) o;
        return Objects.equals(this.cardUID, entity.cardUID) &&
                Objects.equals(this.cardsActionTypeID, entity.cardsActionTypeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardUID, cardsActionTypeID);
    }

}