package com.example.testm.model;

import javax.persistence.*;

@Entity
public class City {
    //name, country, population, area, GDP, description

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Country country;
    private int population;
    private int area;
    private int GDP;
    private String descrip;

    public City() {

    }

    public City(String name, Country country, int population, int area, int GDP, String descrip) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.area = area;
        this.GDP = GDP;
        this.descrip = descrip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String description) {
        this.descrip = description;
    }
}
