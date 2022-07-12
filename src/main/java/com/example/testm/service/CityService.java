package com.example.testm.service;

import com.example.testm.model.City;
import com.example.testm.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    //save
    public void create(City city) {
        cityRepository.save(city);

    }

    //find all
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    //find by id
    public City findById(int id) {
        return cityRepository.findById(id).get();
    }

    public void edit(City city) {
        cityRepository.save(city);
    }

    public void add(City city) {
        cityRepository.save(city);
    }

    public void delete(City city) {
        cityRepository.delete(city);

    }
}
