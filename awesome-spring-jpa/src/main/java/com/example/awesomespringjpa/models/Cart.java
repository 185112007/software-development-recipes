package com.example.awesomespringjpa.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gafur
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<CartItem> cartItems = new ArrayList<>();
}
