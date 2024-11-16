package org.example;
import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;


public class Main {
    public static void main(String[] args) {

        /*Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());*/

        CarSkeleton car1 = new CarSkeleton("asd","edsda");
        CarSkeleton car2 = new GasPoweredCar(8,4);
        CarSkeleton car3 = new ElectricCar(8,4);
        CarSkeleton car4 = new HybridCar(8,4,4);
        System.out.println(car2.startEngine());
        System.out.println(car3.startEngine());
        System.out.println(car4.startEngine());
        System.out.println(car2.drive());



    }
}