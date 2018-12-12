package com.example.jaime.dine_me;

public class DineMeUser {
    private int id;
    private String username;
    private String gmail;
    private String description;
    private int age;
    private String foods;
    private String location;

    public DineMeUser() {

    }

    public DineMeUser(int id, String username, String gmail, String description, int age, String foods, String location) {
        this.id = id;
        this.username = username;
        this.gmail = gmail;
        this.description = description;
        this.age = age;
        this.foods = foods;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}