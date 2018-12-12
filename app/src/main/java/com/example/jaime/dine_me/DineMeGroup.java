package com.example.jaime.dine_me;

public class DineMeGroup {
    private int id;
    private int dbId;
    private String name;
    private String description;
    private String date;
    private String imageUrl;

    public DineMeGroup() {

    }


    public DineMeGroup(int id, int dbId, String name, String description, String date, String imageUrl) {
        this.id = id;
        this.dbId = dbId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
