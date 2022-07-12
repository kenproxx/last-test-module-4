package com.example.testm.service;

import com.example.testm.model.Country;
import com.example.testm.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    //save
    public void create(Country country) {
        countryRepository.save(country);

    }

//find all
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    //find by id
    public Country findById(int id) {
        return countryRepository.findById(id).get();
    }

    //delete
    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    //update
    public void update(Country country) {
        countryRepository.save(country);
    }


    public void edit(Country country) {
        countryRepository.save(country);
    }
}
