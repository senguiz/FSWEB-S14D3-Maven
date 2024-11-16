package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    public void startEngine(){

    }
    public void drive(){
        runEngine();
    }

}
