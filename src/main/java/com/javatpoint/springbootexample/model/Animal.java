package com.javatpoint.springbootexample.model;

public class Animal {
    String animalName;
    String animalCategory;
    AnimalProperty animalProperty;

    public Animal(String animalName, String animalCategory, AnimalProperty animalProperty) {
        this.animalName = animalName;
        this.animalCategory = animalCategory;
        this.animalProperty = animalProperty;
    }

    public Animal() {
    }

    public AnimalProperty getAnimalProperty() {
        return animalProperty;
    }

    public void setAnimalProperty(AnimalProperty animalProperty) {
        this.animalProperty = animalProperty;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(String animalCategory) {
        this.animalCategory = animalCategory;
    }
}
