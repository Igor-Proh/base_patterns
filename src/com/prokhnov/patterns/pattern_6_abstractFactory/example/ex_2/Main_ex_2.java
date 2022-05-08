package com.prokhnov.patterns.pattern_6_abstractFactory.example.ex_2;

public class Main_ex_2 {
    public static void main(String[] args) {
        // Cars factory
        Factory carsFactory = new AbstractFactory().createFactory("car");
        Car toyota = carsFactory.createCar("toyota");
        Car audi = carsFactory.createCar("audi");

        toyota.drive();
        audi.drive();

        // Tanks factory
        Factory tanksFactory = new AbstractFactory().createFactory("tank");
        Tank t50 = tanksFactory.createTank("t50");
        Tank t52 = tanksFactory.createTank("t52");

        t50.drive();
        t52.drive();



    }
}

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("Toyota drive...");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Audi drive...");
    }
}

class CarFactory implements Factory {
    public Car createCar(String car) {
        switch (car) {
            case "toyota":
                return new Toyota();
            case "audi":
                return new Audi();
            default:
                return null;
        }
    }

    @Override
    public Tank createTank(String tank) {
        return null;
    }
}

interface Tank {
    void drive();
}

class T50 implements Tank {

    @Override
    public void drive() {
        System.out.println("T-50 drive...");
    }
}

class T52 implements Tank {

    @Override
    public void drive() {
        System.out.println("T52 drive...");
    }
}

class TankFactory implements Factory {
    @Override
    public Car createCar(String car) {
        return null;
    }

    public Tank createTank(String tank){
        switch (tank){
            case "t50": return new T50();
            case "t52": return new T52();
            default:return null;
        }
    }
}

interface Factory {
    Car createCar(String car);
    Tank createTank(String tank);

}

class AbstractFactory{
    Factory createFactory(String factory){
        switch (factory){
            case "car": return new CarFactory();
            case "tank": return new TankFactory();
            default: return null;
        }
    }
}