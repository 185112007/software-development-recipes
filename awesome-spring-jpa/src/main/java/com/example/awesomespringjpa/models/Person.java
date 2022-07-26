package com.example.awesomespringjpa.models;

import lombok.*;

import javax.persistence.*;

/**
 * @author gafur
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;

    @OneToOne(mappedBy = "person")
    private Passport passport;
}
