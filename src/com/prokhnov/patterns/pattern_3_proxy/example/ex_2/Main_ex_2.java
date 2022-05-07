package com.prokhnov.patterns.pattern_3_proxy.example.ex_2;

public class Main_ex_2 {
    public static void main(String[] args) {
        // Инициализация класса Car Прокси объектом
        Car car = new CarProxy();
        car.drive();
    }
}

interface Car {
    void drive();
}

// класс прокси реализует интерфейс класса Car (для которого мы хотим создать прослойку)
// имитируя его поведение, но с дополнительными действиями.
class CarProxy implements Car{
    Car car = new Renault();
    @Override
    public void drive() {
        System.out.println("In CarProxy!");
        car.drive();
    }
}

class Renault implements Car {
    @Override
    public void drive() {
        System.out.println("Renault drive!");
    }
}
