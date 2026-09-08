package org.example.arfoodhunt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Collectible {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String model3D;

    @Enumerated(EnumType.STRING)
    private CollectibleType type;

    private int xpReward;

    private int coinReward;

    private double latitude;

    private double longitude;

    private boolean available;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;

    @ManyToOne
    @JoinColumn(name = "foodtruck_id")
    private FoodTruck foodTruck;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}