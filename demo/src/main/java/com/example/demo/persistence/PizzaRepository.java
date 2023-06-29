package com.example.demo.persistence;

import com.example.demo.domain.PizzaDTO;
import com.example.demo.domain.repository.PizzaRepositoryDTO;
import com.example.demo.persistence.CRUD.PizzaRepositoryCRUD;
import com.example.demo.persistence.mapper.PizzaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaRepository implements PizzaRepositoryDTO {

    @Autowired
    private PizzaRepositoryCRUD pizzaRepositoryCRUD;

    @Autowired
    private PizzaMapper mapper;
    @Override
    public List<PizzaDTO> getAvailable() {
        return mapper.toPizzasDTO(this.pizzaRepositoryCRUD.findAllByAvailableTrueOrderByPrice());
    }
}
