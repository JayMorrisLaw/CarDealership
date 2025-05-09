package com.pluralsight;

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
    public ArrayList<Vehicle> searchByPrice(double min, double max) { return null; }
    public ArrayList<Vehicle> searchByMakeModel(String make, String model) { return null; }
    public ArrayList<Vehicle> searchByYear(int min, int max) { return null; }
    public ArrayList<Vehicle> searchByColor(String color) { return null; }
    public ArrayList<Vehicle> searchByMileage(int min, int max) { return null; }
    public ArrayList<Vehicle> searchByType(String type) { return null; }

    public void removeVehicle(Vehicle vehicle){

    }
}
