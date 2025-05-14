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
        if (dealership == null){
            System.out.println("Error: file not found!");
            return;
        }
    }

    public void display(){
        // display menu
        int choice  = 0;
        while(choice !=99){
            System.out.println("\n Welcome to the Dealership Menu! ");
            System.out.println("1 = search by price");
            System.out.println("2 = search by make/model");
            System.out.println("3 = search by year");
            System.out.println("4 = search by color");
            System.out.println("5 = search by model");
            System.out.println("6 = search by type");
            System.out.println("7 = show all vehicles");
            System.out.println("8 = add a vehicle");
            System.out.println("9 = remove a vehicle");
            System.out.println("99 = exit");
            System.out.println(" enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.println("enter minimun price: ");
                    double min = scanner.nextDouble();
                    System.out.println("enter maximum price: ");
                    double max = scanner.nextDouble();
                    scanner.nextLine();

                    ArrayList<Vehicle> priceResults = dealership.searchByPrice(min, max);

                    for (Vehicle vehicle : priceResults) {
                        System.out.println(vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel() + " - $" + vehicle.getPrice());
                    }
                    break;
                    
                case 2:
                    System.out.println("enter vehicle make: ");
                    String make = scanner.nextLine();
                    System.out.println("enter vehicle model: ");
                    String model = scanner.nextLine();
                    
                    ArrayList<Vehicle> makeModelResults = dealership.searchByMakeModel(make,model);
                    for (Vehicle vehicle : makeModelResults) {
                        System.out.println(vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getPrice());
                    }
                    break;

                case 3:
                    System.out.println(" enter minimun vehicle year: ");
                    int minYear = scanner.nextInt();
                    System.out.println("enter maximum vehicle year: ");
                    int maxYear = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Vehicle> minMaxYearResults = dealership.searchByYear(min, max);
                    for (Vehicle vehicle : minMaxYearResults) {
                        System.out.println(vehicle.getYear() + " "+ );

                    }
            }
            

        }


    }

}