package com.it.unimi.vassallo.wca.ilvolo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @NotNull
    private Date date;

    @NotNull
    private int maxReservations;

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getMaxReservations() {
        return maxReservations;
    }
}
