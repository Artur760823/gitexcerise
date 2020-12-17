package com.company;

public class Dog {
    private String name;
    private String race;

    public Dog(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public void bark(){
        System.out.println("Woof woof");
    }
}
