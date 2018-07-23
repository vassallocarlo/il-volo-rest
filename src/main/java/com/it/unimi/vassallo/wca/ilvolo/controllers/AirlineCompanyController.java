package com.it.unimi.vassallo.wca.ilvolo.controllers;

import com.it.unimi.vassallo.wca.ilvolo.models.AirlineCompany;
import com.it.unimi.vassallo.wca.ilvolo.repositories.AirlineCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline-company")
public class AirlineCompanyController {

    @Autowired
    private AirlineCompanyRepository airlineCompanyRepository;

    @GetMapping
    public Iterable<AirlineCompany> getAirlineCompanies(){
        return airlineCompanyRepository.findAll();
    }
}
