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
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    @ManyToMany(mappedBy = "subscribers", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Channel> channels = new ArrayList<>();
}
