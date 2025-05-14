package com.pluralsight;

import java.util.Scanner;

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

        }


    }

}