package com.example.testm.controller;

import com.example.testm.model.Country;
import com.example.testm.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<Iterable<Country>> findAll() {
        List<Country> countries = countryService.findAll();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    //edit
    @PutMapping("/edit")
    public ResponseEntity<Country> edit(@RequestBody Country country) {
        countryService.edit(country);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

}
