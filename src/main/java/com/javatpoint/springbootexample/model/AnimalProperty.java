package com.javatpoint.springbootexample.model;

public class AnimalProperty {
    int lifeExpectancy;
    boolean hasFourLegs;

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public boolean isHasFourLegs() {
        return hasFourLegs;
    }

    public void setHasFourLegs(boolean hasFourLegs) {
        this.hasFourLegs = hasFourLegs;
    }

    public AnimalProperty() {
    }

    public AnimalProperty(int lifeExpectancy, boolean hasFourLegs) {
        this.lifeExpectancy = lifeExpectancy;
        this.hasFourLegs = hasFourLegs;
    }
}
