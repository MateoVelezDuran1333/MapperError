package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Length;

import java.time.LocalDateTime;

@Entity
@Table(name = "pizza_order")
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_customer", length = 15, nullable = false)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(columnDefinition = "DECIMAL(6,2)", nullable = false)
    private Double total;

    @Column(columnDefinition = "CHAR(1)", nullable = false)
    private String mehtod;

    @Column(name = "additional_notes", length = 200)
    private String additionalNotes;


}
