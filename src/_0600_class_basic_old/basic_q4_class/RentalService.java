package _0600_class_basic_old.basic_q4_class;

import java.util.ArrayList;

public class RentalService {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayAvailableCars() {
        for (Car car : cars) {
            if (!car.isRented()) {
                car.displayInfo();
            }
        }
    }

    public void rentCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && !car.isRented()) {
                car.rentCar();
                System.out.println("Car rented: " + licensePlate);
                return;
            }
        }
        System.out.println("Car not available: " + licensePlate);
    }

    public void returnCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && car.isRented()) {
                car.returnCar();
                System.out.println("Car returned: " + licensePlate);
                return;
            }
        }
        System.out.println("Car not found: " + licensePlate);
    }
}
