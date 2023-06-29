package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {
    private Integer idPizza;
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;
    private boolean vegan;
    private boolean available;
}
