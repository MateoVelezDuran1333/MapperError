package com.example.demo.persistence.mapper;

import com.example.demo.domain.PizzaDTO;
import com.example.demo.persistence.entity.PizzaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PizzaMapper {
    PizzaDTO toPizzaDTO(PizzaEntity pizzaEntity);
    List<PizzaDTO> toPizzasDTO (List<PizzaEntity> pizzaEntities);

    @InheritInverseConfiguration
    PizzaEntity toPizzaEntity(PizzaDTO pizzaDTO);
}
