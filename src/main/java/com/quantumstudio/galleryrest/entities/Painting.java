package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity

public class Painting {



    @Id

    @GeneratedValue

    private long id;



    @Column(unique = true)

    @NotNull

    private String name;



    @NotNull

    @Min(1)

    private double price;



    @NotNull

    @Min(0)

    private int stock;



    @ManyToOne

    private Technique technique;



    @ManyToOne

    private Artist artist;



    @OneToMany

    private List<Purchase> purchaseList;



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



    public Technique getTechnique() {

        return technique;

    }



    public Painting setTechnique(Technique technique) {

        this.technique = technique;

        return this;

    }



    public Artist getArtist() {

        return artist;

    }



    public void setArtist(Artist artist) {

        this.artist = artist;

    }



    public List<Purchase> getPurchaseList() {

        return purchaseList;

    }



    public Painting setPurchaseList(List<Purchase> purchaseList) {

        this.purchaseList = purchaseList;

        return this;

    }

}
