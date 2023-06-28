package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {

    public List<PizzaEntity>  findAllByAvailableTrueOrderByPrice();

}
