package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

  // constructor
    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }
    // methods for search, return null for now
    public ArrayList<Vehicle> searchByPrice(double min, double max){
      ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                results.add(vehicle);
            }
        }
        return results;
    }
    public ArrayList<Vehicle> searchByMakeModel(String make, String model) {
        ArrayList<Vehicle> MakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                MakeModel.add(vehicle);
            }
        }
        return MakeModel;
    }
    public ArrayList<Vehicle> searchByYear(int min, int max) {
        ArrayList<Vehicle> YearSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                YearSearch.add(vehicle);
            }
        }
        return YearSearch;
    }
    public ArrayList<Vehicle> searchByColor(String color) {
        ArrayList<Vehicle> ColorSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)){
                ColorSearch.add(vehicle);
            }
        }
        return ColorSearch;
    }
    public ArrayList<Vehicle> searchByMileage(int min, int max) {
        ArrayList<Vehicle> MileSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                MileSearch.add(vehicle);
            }
        }
        return MileSearch;
    }
    public ArrayList<Vehicle> searchByType(String type) {
        ArrayList<Vehicle> TypeSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(type)){
                TypeSearch.add(vehicle);
            }
        }
        return TypeSearch;
    }

    public void removeVehicle(Vehicle vehicle){

    }



}
