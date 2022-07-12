package com.example.testm.controller;

import com.example.testm.model.City;
import com.example.testm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
@CrossOrigin("*")

public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public ResponseEntity<Iterable<City>> findAll() {
        List<City> cities = cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<City> create(@RequestBody City city) {
        cityService.create(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }


    //edit city
    @PutMapping("/edit")
    public ResponseEntity<City> edit(@RequestBody City city) {
        cityService.edit(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    //add city
    @PostMapping("/add")
    public ResponseEntity<City> add(@RequestBody City city) {
        cityService.add(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/delete")
    public ResponseEntity<City> delete(@RequestBody City city) {
        cityService.delete(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }


    //find by id
    @GetMapping("/{id}")
    public ResponseEntity<City> findById(@PathVariable int id) {
        City city = cityService.findById(id);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }





}
