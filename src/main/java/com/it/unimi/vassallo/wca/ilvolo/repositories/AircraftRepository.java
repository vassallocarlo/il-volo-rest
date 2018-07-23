package com.it.unimi.vassallo.wca.ilvolo.repositories;

import com.it.unimi.vassallo.wca.ilvolo.models.Aircraft;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AircraftRepository extends PagingAndSortingRepository<Aircraft, Integer> {
}