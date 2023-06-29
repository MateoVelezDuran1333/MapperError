package com.example.demo.domain.service;

import com.example.demo.domain.PizzaDTO;
import com.example.demo.domain.repository.PizzaRepositoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceDTO {
    @Autowired
    private PizzaRepositoryDTO pizzaRepositoryDTO;

    public List<PizzaDTO> getAvailable(){
        return this.pizzaRepositoryDTO.getAvailable();
    }
}
