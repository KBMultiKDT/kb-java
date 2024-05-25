package _0621_class_team.team_q4_class;

public class Main {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        Car car1 = new Car();
        car1.setModel("Toyota Camry");
        car1.setLicensePlate("123ABC");

        Car car2 = new Car();
        car2.setModel("Honda Civic");
        car2.setLicensePlate("456DEF");

        rentalService.addCar(car1);
        rentalService.addCar(car2);

        System.out.println("<<<<<<렌탈 차량 등록>>>>>>>");
        rentalService.displayAvailableCars();
        System.out.println();

        System.out.println("<<<<<<렌탈 시작>>>>>>>");
        rentalService.rentCar("123ABC");
        System.out.println("현재까지의 렌탈 차량 목록----------------");
        rentalService.displayAvailableCars();

        rentalService.returnCar("123ABC");
        System.out.println("현재까지의 렌탈 차량 목록----------------");
        rentalService.displayAvailableCars();
    }
}
