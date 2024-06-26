package _0627_inherit_basic.basic_q1_inherit;

public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
