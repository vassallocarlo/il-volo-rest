package com.it.unimi.vassallo.wca.ilvolo.models;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@IdClass(FleetAircraftId.class)
public class FleetAircraft {

    @Id
    @ManyToOne
    private AirlineCompany airlineCompany;

    @Id
    @ManyToOne
    private Aircraft aircraft;

    private int quantity;

    public AirlineCompany getAirlineCompany() {
        return airlineCompany;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public int getQuantity() {
        return quantity;
    }
}