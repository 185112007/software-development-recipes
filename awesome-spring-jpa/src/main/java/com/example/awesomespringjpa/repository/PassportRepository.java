package com.example.awesomespringjpa.repository;

import com.example.awesomespringjpa.models.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gafur
 */
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
