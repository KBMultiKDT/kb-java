package _0621_class_team.team_q4_class;

public class Car {
    private String model;
    private String licensePlate;
    private boolean isRented;

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        isRented = true;
    }

    public void returnCar() {
        isRented = false;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", License Plate: " + licensePlate + ", Rented: " + isRented);
    }
}
