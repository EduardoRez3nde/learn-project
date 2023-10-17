package com.devsuperior.dslearnbds.entities;


import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_enrollments")
public class Enrollment implements Serializable {

    @EmbeddedId
    private final EnrollmentPK id = new EnrollmentPK(); // chave composta

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;

    private Boolean available;

    private Boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private final Set<Lesson> lessonsDone =new HashSet<>();

    public Enrollment() {}

    public Enrollment(Instant enrollMoment, Instant refundMoment, Boolean available,
                      Boolean onlyUpdate, User user, Offer offer) {
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
        id.setOffer(offer);
        id.setUser(user);
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);
    }

    public User getUser() {
        return id.getUser();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public Instant getEnrollMoment() {
        return enrollMoment;
    }

    public void setEnrollMoment(Instant enrollMoment) {
        this.enrollMoment = enrollMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(Boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }

    public Set<Lesson> getLessonsDone() {
        return lessonsDone;
    }
}
