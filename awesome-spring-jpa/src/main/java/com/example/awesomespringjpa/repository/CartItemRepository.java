package com.example.awesomespringjpa.repository;

import com.example.awesomespringjpa.models.Cart;
import com.example.awesomespringjpa.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gafur
 */
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
