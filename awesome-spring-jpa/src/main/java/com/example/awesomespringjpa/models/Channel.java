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
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String url;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Subscriber> subscribers = new ArrayList<>();
}
