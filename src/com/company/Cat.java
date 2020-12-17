package com.company;

public class Cat {
    private String race;
    private String name;
    private String color;
    private int age;

    public Cat(String race, String name, String color, int age) {
        this.race = race;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("My cat name is %s and it's %s color cat. My cat is %d years old", name, color, age);
    }
}
