package org.example.arge;

public class ElectricCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;

    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
    public void startEngine(){

    }
    public void drive(){
        runEngine();
    }
}
