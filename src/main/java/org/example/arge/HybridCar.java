package org.example.arge;

public class HybridCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    public String startEngine(){
        return getClass().getSimpleName()+"'s engine started.";
    }

    public String drive(){
        runEngine();
        return getClass().getSimpleName()+" is driving.";
    }
}
