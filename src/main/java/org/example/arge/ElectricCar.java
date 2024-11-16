package org.example.arge;

public class ElectricCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
    public String startEngine(){
        return getClass().getSimpleName()+"'s engine started.";
    }

    public String drive(){
        runEngine();
        return getClass().getSimpleName()+" is driving.";
    }
}
