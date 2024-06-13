package _0626_inherit_basic.basic_q4_inherit;

import java.util.Scanner;

class Restaurant {
    private int availableTables;

    public Restaurant(int tables) {
        this.availableTables = tables;
    }

    public synchronized boolean reserveTable() {
        if (availableTables > 0) {
            availableTables--;
            System.out.println("Table reserved. Tables left: " + availableTables);
            return true;
        } else {
            System.out.println("No tables available to reserve.");
            return false;
        }
    }

    public synchronized boolean cancelReservation() {
        availableTables++;
        System.out.println("Reservation cancelled. Tables available: " + availableTables);
        return true;
    }

    public synchronized int getAvailableTables() {
        return availableTables;
    }
}

public class Main {
    private static void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Reserve a table");
        System.out.println("2. Cancel a reservation");
        System.out.println("3. Show current status");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant(10); // 10 tables initially available

        int choice = 0;
        while (choice != 4) {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Reserve a table
                    new Thread(() -> restaurant.reserveTable()).start();
                    break;
                case 2: // Cancel a reservation
                    new Thread(() -> restaurant.cancelReservation()).start();
                    break;
                case 3: // Show current status
                    System.out.println("Current tables available: " + restaurant.getAvailableTables());
                    break;
                case 4: // Exit
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
