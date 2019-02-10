package com.company.stories.clinic;

import com.company.stories.UnorderedCollection;

public class Animal {
    private String name;
    private String type;
    private int id;
    private int age;
    private UnorderedCollection<Appointment> appointments;

    public Animal(String name, String type, int id, int age) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.age = age;
        appointments = new UnorderedCollection<>(50);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incAge() {
        this.age++;
    }

    public UnorderedCollection<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(UnorderedCollection<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String toString() {
        return "id=" + id + ",name=" + name + ",age=" + age;
    }
}
