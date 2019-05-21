package com.quantumstudio.galleryrest.entities;

import java.util.ArrayList;

public class Technique {

    private long id;
    private String name;
    private ArrayList<Artist> artistList;
    private ArrayList<Painting> paintingList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(ArrayList<Artist> artistList) {
        this.artistList = artistList;
    }

    public ArrayList<Painting> getPaintingList() {
        return paintingList;
    }

    public void setPaintingList(ArrayList<Painting> paintingList) {
        this.paintingList = paintingList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
