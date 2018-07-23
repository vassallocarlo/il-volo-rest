package com.it.unimi.vassallo.wca.ilvolo.models;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Aircraft{

    public static enum Engine{
        TURBOJET, TURBOPROP, TURBOFAN, TURBOSHAFT
    };

    public static enum Haul{
        SHORT, MEDIUM, LONG, ULTRA_LONG
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @NotNull
    @NotEmpty
    private String model;

    @NotNull
    private int seats;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Haul haul;

    @NotNull
    private float maxSpeed;

    @NotNull
    private float wingspan;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Engine engine;

    @NotNull
    @ManyToMany(mappedBy = "allowedAircraft")
    private Set<Route> routes = new HashSet<>();

    public Set<Route> getRoutes() {
        return routes;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public Haul getHaul() {
        return haul;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getWingspan() {
        return wingspan;
    }

    public Engine getEngine() {
        return engine;
    }
}