package com.it.unimi.vassallo.wca.ilvolo.models;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Route{

    public static enum Type{
        NATIONAL, INTERNATIONAL
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Type type;

    @NotNull
    @NotEmpty
    private String departureAirport;

    @NotNull
    @NotEmpty
    private String arrivalAirport;

    @NotNull
    @ManyToMany(cascade = { CascadeType.ALL })
    private Set<Slot> slot = new HashSet<>();

    @NotNull
    @ManyToMany(cascade = { CascadeType.ALL })
    private Set<Aircraft> allowedAircraft = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Set<Slot> getSlot() { return slot; }

    public Set<Aircraft> getAllowedAircraft() { return allowedAircraft; }
}