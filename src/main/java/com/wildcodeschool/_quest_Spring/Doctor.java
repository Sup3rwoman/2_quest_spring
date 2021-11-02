package com.wildcodeschool._quest_Spring;

public class Doctor {
    private String name;
    private int number;

    public Doctor(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static Doctor newDoctor(String name, int id) {
        return new Doctor(name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
