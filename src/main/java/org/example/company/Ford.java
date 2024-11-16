package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
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
