package _0600_inherit_basic.basic_q2_inherit._0627_inherit_basic.basic_q2_inherit;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        Bike bike = new Bike("Yamaha", "MT-15", true);

        car.display();
        bike.display();
    }
}
