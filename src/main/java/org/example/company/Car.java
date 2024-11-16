package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        if (((Car)car).name == this.name) {
            return true;
        }else if(((Car)car).cylinders == this.cylinders){
            return true;
        }
        return false;
    }
    public String startEngine(){
        return "The "+getClass().getSimpleName()+"'s engine is starting.";

    }
    public String accelerate(){
        return "The "+getClass().getSimpleName()+" is accelerating.";
    }
    public String brake(){
        return"The "+getClass().getSimpleName()+" is braking.";
    }



}


