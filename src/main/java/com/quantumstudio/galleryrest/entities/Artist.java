package com.quantumstudio.galleryrest.entities;

import java.util.ArrayList;

public class Artist {

    private long id;
    private String name;
    private ArrayList<Painting> paintingList;
    private ArrayList<Client> clientList;
    private ArrayList<Technique> techniqueList;

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

    public ArrayList<Painting> getPaintingList() {
        return paintingList;
    }

    public void setPaintingList(ArrayList<Painting> paintingList) {
        this.paintingList = paintingList;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public ArrayList<Technique> getTechniqueList() {
        return techniqueList;
    }

    public void setTechniqueList(ArrayList<Technique> techniqueList) {
        this.techniqueList = techniqueList;
    }
}
