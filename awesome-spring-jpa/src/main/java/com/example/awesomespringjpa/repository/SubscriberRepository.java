package com.example.awesomespringjpa.repository;

import com.example.awesomespringjpa.models.CartItem;
import com.example.awesomespringjpa.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gafur
 */
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {
}
