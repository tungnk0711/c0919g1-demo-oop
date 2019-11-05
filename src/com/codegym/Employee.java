package com.codegym;

public class Employee {
    private int id;
    private String name;
    private boolean gender;
    private String description;

    public Employee() {
    }

    public Employee(int id, String name, boolean gender, String description) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public Employee(boolean gender, String description) {
        this.gender = gender;
        this.description = description;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfor(){
        System.out.println("Hello");
    }
}
