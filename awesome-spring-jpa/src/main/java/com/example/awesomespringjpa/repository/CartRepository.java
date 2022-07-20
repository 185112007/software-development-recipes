package com.example.awesomespringjpa.repository;

import com.example.awesomespringjpa.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gafur
 */
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
