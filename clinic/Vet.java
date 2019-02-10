package com.company.stories.clinic;

public class Vet {
    private int id;
    private String name;
    private int yearOfExperiance;

    public Vet(int id, String name, int yearOfExperiance) {
        this.id = id;
        this.name = name;
        this.yearOfExperiance = yearOfExperiance;
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

    public int getYearOfExperiance() {
        return yearOfExperiance;
    }

    public void setYearOfExperiance(int yearOfExperiance) {
        this.yearOfExperiance = yearOfExperiance;
    }
}
