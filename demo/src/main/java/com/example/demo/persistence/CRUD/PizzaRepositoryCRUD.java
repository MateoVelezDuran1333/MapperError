package com.example.demo.persistence.CRUD;

import com.example.demo.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaRepositoryCRUD extends ListCrudRepository<PizzaEntity, Integer> {

    public List<PizzaEntity>  findAllByAvailableTrueOrderByPrice();

}
