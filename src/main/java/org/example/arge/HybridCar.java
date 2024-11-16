package org.example.arge;

public class HybridCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    public void startEngine(){

    }
    public void drive(){
        runEngine();
    }
}
