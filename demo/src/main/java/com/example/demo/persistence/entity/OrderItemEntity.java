package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@IdClass(OrderItemID.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderItemEntity {
    @Id
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Id
    @Column(name = "id_item", nullable = false)
    private Integer idItem;

    @Column(name = "id_pizza")
    private Integer idPizza;

    @Column(columnDefinition = "DECIMAL(2,1)", nullable = false)
    private Double quantity;

    @Column(columnDefinition = "DECIMAL(5,2)")
    private Double price;

}
