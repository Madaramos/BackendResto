package com.app.Restaurant.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;


@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name ="user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;
    @Column(name= "name")
    private String name;
    @Column(name= "contactNumber")
    private String contactNumber;
    @Column(name= "email")
    private String email;
    @Column(name= "password")
    private String password;
    @Column(name= "status")
    private String status;
    @Column(name= "role")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "User_Roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;
    @JsonIgnore
    @OneToOne(mappedBy="user")
    @JsonIgnore
    private Restaurant rest;
}
