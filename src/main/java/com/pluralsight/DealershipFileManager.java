package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    public Dealership getDealership(){
        try{
            // reading from file
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

            String dealershipInfo = reader.readLine();
            String[] dealershipFields = dealershipInfo.split("\\|");
            Dealership dealership = new Dealership(dealershipFields[0],dealershipFields[1],dealershipFields[2]);

            // read remaining lines for vehicles
            String line;
            while ((line = reader.readLine()) != null){
                String[] fields = line.split("\\|");

                int vin = Integer.parseInt(fields[0]);
                int year = Integer.parseInt(fields[1]);
                String make = fields[2];
                String model = fields[3];
                String type = fields[4];
                String color = fields[5];
                int odometer = Integer.parseInt(fields[6]);
                double price = Double.parseDouble(fields[7]);

                Vehicle vehicle = new Vehicle(vin,year,make,model,type,color,odometer,price);
                dealership.addVehicle(vehicle);
            }
            reader.close();
            return dealership;
        } catch (Exception e){
            return null;
        }

        }
    }

