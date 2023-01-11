package oop.showroom;

public class Car extends Vehicle {

    private String fuel;
    private String carDrive;
    private int doorsNumber;
    private String capacity;
    private int passangersNumber;


    public Car(String brand, String model, String colour, String engine, double mileage, String gearboxType, boolean isUsed, String fuel, String carDrive, int doorsNumber, String capacity, int passangersNumber) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.fuel = fuel;
        this.carDrive = carDrive;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.passangersNumber = passangersNumber;
    }
}
