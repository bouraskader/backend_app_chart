package com.javelot.model.dao;

import com.javelot.model.entities.CityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CityTempRepository extends JpaRepository<CityInfo, Long> {



}
