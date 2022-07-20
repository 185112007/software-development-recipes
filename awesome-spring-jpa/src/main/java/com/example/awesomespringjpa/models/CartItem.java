package com.example.awesomespringjpa.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author gafur
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productCode;

    private Integer quantity;

    private BigDecimal unitPrice;

    @ManyToOne
    private Cart cart;
}
