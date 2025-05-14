package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;


public class UserInterface {
    private Scanner scanner;
    private Dealership dealership;

    public UserInterface() {
        scanner = new Scanner(System.in);

        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
        if (dealership == null) {
            System.out.println("Error: file not found!");
        }
    }

    public void display() {
        // display menu
        int choice = 0;
        while (choice != 99) {
            System.out.println("\n Welcome to the Dealership Menu! ");
            System.out.println("1 = search by price");
            System.out.println("2 = search by make/model");
            System.out.println("3 = search by year");
            System.out.println("4 = search by color");
            System.out.println("5 = search by mileage: ");
            System.out.println("6 = search by type");
            System.out.println("7 = show all vehicles");
            System.out.println("8 = add a vehicle");
            System.out.println("9 = remove a vehicle");
            System.out.println("99 = exit");
            System.out.println(" enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    processGetByPrice();
                    break;
                case 2:
                    processGetByMakeModel();
                    break;
                case 3:
                    processGetByYear();
                    break;
                case 4:
                    processGetByColor();
                    break;
                case 5:
                    processGetByMileage();
                    break;
                case 6:
                    processGetByType();
                    break;
                case 7:
                    processGetAllVehicles();
                    break;
                case 8:
                    processAddVehicle();
                    break;
                case 9:
                    processRemoveVehicle();
                    break;
                case 99:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");

            }

        }
    }

    private void processGetByPrice() {
        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByPrice(min, max);
        displayVehicles(results);
    }

    private void processGetByMakeModel() {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByMakeModel(make, model);
        displayVehicles(results);
    }

    private void processGetByYear() {
        System.out.print("Enter minimum year: ");
        int minYear = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int maxYear = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByYear(minYear, maxYear);
        displayVehicles(results);
    }

    private void processGetByColor() {
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByColor(color);
        displayVehicles(results);
    }

    private void processGetByMileage() {
        System.out.print("Enter minimum mileage: ");
        int minMileage = scanner.nextInt();
        System.out.print("Enter maximum mileage: ");
        int maxMileage = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByMileage(minMileage, maxMileage);
        displayVehicles(results);
    }
    private void processGetByType() {
        System.out.print("Enter vehicle type: ");
        String type = scanner.nextLine();

        ArrayList<Vehicle> results = dealership.searchByType(type);
        displayVehicles(results);
    }

    private void processGetAllVehicles() {
        ArrayList<Vehicle> results = dealership.getAllVehicles();
        displayVehicles(results);
    }

    private void processAddVehicle() {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter make: ");
        String make = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        System.out.print("Enter odometer (miles): ");
        int odometer = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Vehicle newVehicle = new Vehicle(0,year, make, model, color, type, odometer, price);
        dealership.addVehicle(newVehicle);

        System.out.println("Vehicle added successfully.");
    }

    private void processRemoveVehicle() {
        System.out.print("Enter year of vehicle to remove: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter make: ");
        String make = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        Vehicle vehicleToRemove = dealership.findVehicle(year, make, model); // assumes method exists
        if (vehicleToRemove != null) {
            dealership.removeVehicle(vehicleToRemove);
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
        }
    }
}



