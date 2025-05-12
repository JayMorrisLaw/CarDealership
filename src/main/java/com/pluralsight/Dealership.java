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
        ArrayList<Vehicle> makeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                makeModel.add(vehicle);
            }
        }
        return makeModel;
    }
    public ArrayList<Vehicle> searchByYear(int min, int max) {
        ArrayList<Vehicle> yearSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                yearSearch.add(vehicle);
            }
        }
        return yearSearch;
    }
    public ArrayList<Vehicle> searchByColor(String color) {
        ArrayList<Vehicle> colorSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)){
                colorSearch.add(vehicle);
            }
        }
        return colorSearch;
    }
    public ArrayList<Vehicle> searchByMileage(int min, int max) {
        ArrayList<Vehicle> mileSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                mileSearch.add(vehicle);
            }
        }
        return mileSearch;
    }
    public ArrayList<Vehicle> searchByType(String type) {
        ArrayList<Vehicle> typeSearch = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(type)){
                typeSearch.add(vehicle);
            }
        }
        return typeSearch;
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);

    }



}
