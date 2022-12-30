package com.javelot.model.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String date;

    private Float temperature;

}
