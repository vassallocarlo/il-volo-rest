package com.it.unimi.vassallo.wca.ilvolo.repositories;

import com.it.unimi.vassallo.wca.ilvolo.models.AirlineCompany;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AirlineCompanyRepository extends PagingAndSortingRepository<AirlineCompany, Integer> {
}