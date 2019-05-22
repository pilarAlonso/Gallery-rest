package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Painting {
@Id
@GeneratedValue
    private long id;
@NotNull
@Min(0)
    private int stock;
    @Column(unique=true)
    @NotNull
    private String name;
    @NotNull
	@Min(1)
    private double price;
    @NotNull
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private Technique technique;
@OneToMany
    private Set<Purchase> purchaseSet;

    public Technique getTechnique() {
        return technique;
    }

    public void setTechnique(Technique technique) {
        this.technique = technique;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<Purchase> getPurchaseSet() {
        return purchaseSet;
    }

    public void setPurchaseSet(Set<Purchase> purchaseSet) {
        this.purchaseSet = purchaseSet;
    }
}
