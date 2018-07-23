package com.it.unimi.vassallo.wca.ilvolo.models;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class AirlineCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String nation;

    @NotNull
    @Min(0)
    private float shareValue;

    @OneToOne
    @JoinColumn(nullable=true)
    private AirlineCompany partner;

    @OneToMany(mappedBy = "airlineCompany")
    private Set<FleetAircraft> fleet = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public float getShareValue() {
        return shareValue;
    }

    public AirlineCompany getPartner() {
        return partner;
    }

    public Set<FleetAircraft> getFleet() { return fleet; }
}