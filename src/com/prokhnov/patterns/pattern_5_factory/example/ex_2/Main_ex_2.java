package com.prokhnov.patterns.pattern_5_factory.example.ex_2;

public class Main_ex_2 {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car audi = carFactory.create("Audi");
        Car bmw = carFactory.create("BMW");

        audi.drive();
        bmw.drive();

    }
}

interface Car {
    void drive();
}

class CarFactory {

    public Car create(String car) {
        switch (car) {
            case "Audi":
                return new Audi();
            case "BMW":
                return new Bmw();
            default:
                return null;
        }
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Audi drive...");
    }
}

class Bmw implements Car {

    @Override
    public void drive() {
        System.out.println("BMW drive...");
    }
}
