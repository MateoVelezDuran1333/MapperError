package com.example.demo.domain.repository;

import com.example.demo.domain.PizzaDTO;

import java.util.List;

public interface PizzaRepositoryDTO {
    List<PizzaDTO> getAvailable();
}
