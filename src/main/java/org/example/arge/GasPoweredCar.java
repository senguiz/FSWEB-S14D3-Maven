package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
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
