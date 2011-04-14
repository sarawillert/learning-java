package com.sarawillert.learningjava;

public class Dog {

    private final String name;
    private final String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public String getName() {
       return name;
    }

    public String getBreed() {
        return breed;
    }
}
