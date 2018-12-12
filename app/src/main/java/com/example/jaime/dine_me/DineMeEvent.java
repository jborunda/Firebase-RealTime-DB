package com.example.jaime.dine_me;

import android.support.annotation.NonNull;


public class DineMeEvent {

    private int id;
    private int dbId;
    private int groupId;
    private String name;
    private String description;
    private String date;
    private String imageUrl;
    private int stars;
    private int starVotes;
    private int minReservation;
    private int maxReservation;
    private String foods;

    //empty constructor to read obj
    public DineMeEvent() {

    }

    public DineMeEvent(int id, int dbId, int groupId, String name, String description, String date, String imageUrl, int stars, int starVotes, int minReservation, int maxReservation, String foods) {
        this.id = id;
        this.dbId = dbId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.imageUrl = imageUrl;
        this.stars = stars;
        this.starVotes = starVotes;
        this.minReservation = minReservation;
        this.maxReservation = maxReservation;
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getStarVotes() {
        return starVotes;
    }

    public void setStarVotes(int starVotes) {
        this.starVotes = starVotes;
    }

    public int getMinReservation() {
        return minReservation;
    }

    public void setMinReservation(int minReservation) {
        this.minReservation = minReservation;
    }

    public int getMaxReservation() {
        return maxReservation;
    }

    public void setMaxReservation(int maxReservation) {
        this.maxReservation = maxReservation;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }
}
