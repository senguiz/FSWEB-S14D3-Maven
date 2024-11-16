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
    public String startEngine(){
        return "The "+getClass().getSimpleName()+"'s engine started.";
    }
    protected String runEngine(){
        return "The "+getClass().getSimpleName()+"'s engine running.";
    }
    public String drive(){
        runEngine();
        return "The "+getClass().getSimpleName()+" is driving.";
    }


}
