package com.mdv.vaidyasETP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TouristPlace {
    public TouristPlace(int id, String placename, String description) {
        this.id = id;
        this.placename = placename;
        this.description = description;
    }

    public TouristPlace(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String placename;
    private String description;

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
