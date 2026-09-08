package org.example.arfoodhunt.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    private int rewardXP;

    private int rewardCoins;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Collectible> collectibles = new ArrayList<>();
}