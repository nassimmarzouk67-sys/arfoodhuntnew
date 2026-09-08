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
public class FoodTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String category;

    private double latitude;

    private double longitude;

    @Column(length = 1000)
    private String description;

    @OneToMany(mappedBy = "foodTruck", cascade = CascadeType.ALL)
    private List<Collectible> collectibles = new ArrayList<>();
}