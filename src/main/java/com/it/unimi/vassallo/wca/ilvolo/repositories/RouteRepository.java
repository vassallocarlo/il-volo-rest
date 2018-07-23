package com.it.unimi.vassallo.wca.ilvolo.repositories;

import com.it.unimi.vassallo.wca.ilvolo.models.Route;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface RouteRepository extends PagingAndSortingRepository<Route, Integer> {
}