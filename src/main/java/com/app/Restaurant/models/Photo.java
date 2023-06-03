package com.app.Restaurant.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
@Data
@Entity
public class Photo {


	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String url;
    @JsonIgnore
    @OneToOne
    private Restaurant rest;
    
}
