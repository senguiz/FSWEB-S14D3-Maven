package org.example.arge;

public class CarSkeleton {
    String name;
    String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){

    }
    protected void runEngine(){

    }
    public void drive(){
    runEngine();
    }


}
