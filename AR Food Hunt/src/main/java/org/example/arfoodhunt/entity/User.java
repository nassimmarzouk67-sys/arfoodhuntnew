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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    private int level;

    private int xp;

    private int coins;

    private String avatar;

    @ManyToMany
    private List<Achievement> achievements = new ArrayList<>();

    @OneToMany
    private List<Reward> rewards = new ArrayList<>();

    @ManyToMany
    private List<Collection> collections = new ArrayList<>();

    @ManyToMany
    private List<Collectible> collectibles = new ArrayList<>();
}