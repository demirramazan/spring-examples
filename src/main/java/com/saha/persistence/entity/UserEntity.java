package com.saha.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 120, unique = true, updatable = true)
    private String userName;

    @Column
    private String name;

    @Column
    private String lastName;


    @OneToOne
    private ProfileEntity profile;

    @OneToMany(mappedBy = "userEntity")
    private List<TweetEntity> tweets;

}