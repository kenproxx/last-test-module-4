package com.example.testm.repository;

import com.example.testm.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository  extends JpaRepository<City, Integer> {


}
