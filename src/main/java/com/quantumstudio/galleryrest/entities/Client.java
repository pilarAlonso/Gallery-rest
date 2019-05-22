package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Client {
@Id
@GeneratedValue
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @OneToMany
    private ArrayList<Purchase> purchaseList;
	@ManyToMany
	private Set<Artist> artistSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Artist> getArtistSet() {
        return artistSet;
    }

    public void setArtistSet(Set<Artist> artistSet) {
        this.artistSet = artistSet;
    }

    public ArrayList<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(ArrayList<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
