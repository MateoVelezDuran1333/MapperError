package com.example.demo.web.Controller;

import com.example.demo.domain.PizzaDTO;
import com.example.demo.domain.service.PizzaServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    @Autowired
    private PizzaServiceDTO pizzaServiceDTO;

    @GetMapping("/available")
    public ResponseEntity<List<PizzaDTO>> getAvailable(){
        return ResponseEntity.ok(this.pizzaServiceDTO.getAvailable());
    }

}
