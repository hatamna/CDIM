import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Main {

  static Scanner input = new Scanner(System.in);

  static ArrayList<Truck> tList = new ArrayList<Truck>();
  static ArrayList<SUV> suvList = new ArrayList<SUV>();
  static ArrayList<Sedan> sedList = new ArrayList<Sedan>();

  static Boolean alwaysT = true;
  static int vehicleCount = 0;

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void displayStock() {
    System.out.println("We currently have " + String.valueOf(vehicleCount) + " cars in stock.");
    System.out.print("\n\nTrucks:\n");
    for (int i = 0; i < tList.size(); i++) {
      System.out.println("Truck #" + String.valueOf(i + 1));
      System.out.println(tList.get(i));
      System.out.print("\n\n");
    }
    System.out.print("-----------------------------------------------");
    System.out.print("\nSUVs:\n");
    for (int i = 0; i < suvList.size(); i++) {
      System.out.println("SUV #" + String.valueOf(i + 1));
      System.out.print(suvList.get(i));
      System.out.print("\n\n");
    }
    System.out.print("-----------------------------------------------");
    System.out.print("\nSedans:");
    for (int i = 0; i < sedList.size(); i++) {
      System.out.println("Sedan #" + String.valueOf(i + 1));
      System.out.print(sedList.get(i));
      System.out.print("\n\n");
    }
    System.out.println("\n");

  }

  public static void getBought() {
    System.out.print("What is the type of car bought?: ");
    String type = input.next();
    System.out.print("What is the make of the car bought?: ");
    String make = input.next();
    System.out.print("What is the year of the car bought?: ");
    int year = input.nextInt();
    System.out.print("What is the cost of the car bought?: ");
    double cost = input.nextDouble();
    System.out.print("What is the color of the car bought?: ");
    String color = input.next();
    System.out.print("What is the last name of the agent that bought the car?: ");
    String agent = input.next();
    if (type.equals("Truck")) {
      Scanner input = new Scanner(System.in);
      System.out.println("What is the engine type of the truck?: ");
      String engineType = input.nextLine();
      System.out.println("What is the drivetrain of the truck?: ");
      String drivetrain = input.nextLine();
      tList.add(new Truck(type, make, year, cost, true, color, agent, engineType, drivetrain));
    } else if (type.equals("SUV")) {
      System.out.print("What is the trim level of the SUV?: ");
      String trim = input.next();
      System.out.print("What is the number of seats in the SUV?: ");
      int numOfSeats = input.nextInt();
      suvList.add(new SUV(type, make, year, cost, true, color, agent, trim, numOfSeats));
    } else if (type.equals("Sedan")) {
      System.out.print("What is the trim level of the Sedan?: ");
      String trim = input.next();
      System.out.print("What is the number of doors in the Sedan?: ");
      int numOfDoors = input.nextInt();
      sedList.add(new Sedan(type, make, year, cost, true, color, agent, trim, numOfDoors));
    } else {
      System.out.print("Unexpected Error");
    }

  }

  public static void getSold() {
    System.out.print("What was the type of vehicle sold? ");
    String soldCarType = input.next();
    System.out.print("What is the number of the vehicle sold? ");
    int soldCarNum = input.nextInt();
    if (soldCarType.equals("Truck")) {
      System.out.print("\n" + tList.get(soldCarNum - 1));
      System.out.println("\n\nAre you sure you want to sell this car? (Y/N): ");
      String confirmSell = input.next();
      if (confirmSell.equals("Y")) {
        tList.get(soldCarNum - 1).setBoughtOrSold(false);
        System.out.print("\nVehicle successfully removed from inventory.\n");
        vehicleCount -= 1;
      } else {
        System.out.println("Vehicle not sold.");
      }
    } else if (soldCarType.equals("SUV")) {
      System.out.println("\n" + suvList.get(soldCarNum - 1));
      System.out.println("\n\nAre you sure you want to sell this car? (Y/N): ");
      String confirmSell = input.next();
      if (confirmSell.equals("Y")) {
        suvList.get(soldCarNum - 1).setBoughtOrSold(false);
        System.out.print("\nVehicle successfully removed from inventory.\n");
        vehicleCount -= 1;
      } else {
        System.out.println("Vehicle not sold.");
      }
    } else if (soldCarType.equals("Sedan")) {
      System.out.print("\n" + sedList.get(soldCarNum - 1));
      System.out.println("\n\nAre you sure you want to sell this car? (Y/N): ");
      String confirmSell = input.next();
      if (confirmSell.equals("Y")) {
        sedList.get(soldCarNum - 1).setBoughtOrSold(false);
        System.out.print("\nVehicle successfully removed from inventory.\n");
        vehicleCount -= 1;
      } else {
        System.out.println("Vehicle not sold.");
      }
    } else {
      System.out.print("Error.");
    }
  }

  public static void main(String[] args) {

    // Trucks
    tList.add(new Truck("Truck", "Toyota", 2022, 45000, true, "Grey", "Smith", "V6", "4x4"));
    tList.add(new Truck("Truck", "Ford", 2021, 60000, true, "Blue", "Jones", "V8", "4x4"));
    tList.add(new Truck("Truck", "RAM", 2018, 36700, true, "Black", "Williams", "V8", "4x4"));
    tList.add(new Truck("Truck", "GMC", 2006, 2900, true, "Light Grey", "Sharma", "I-4", "4x4"));
    // SUVs
    suvList.add(new SUV("SUV", "Honda", 2019, 32999, true, "Black", "Patel", "Touring", 5));
    suvList.add(new SUV("SUV", "Toyota", 2017, 27900, true, "Light Blue", "Ahmed", "SE", 5));
    suvList.add(new SUV("SUV", "KIA", 2022, 14999, true, "White", "Singh", "Touring", 7));
    suvList.add(new SUV("SUV", "Mercedes", 2024, 95420, true, "Light Grey", "Patel", "Full Load", 5));
    // Sedans
    sedList.add(new Sedan("Sedan", "Honda", 2019, 21000, true, "Black", "Smith", "Touring", 4));
    sedList.add(new Sedan("Sedan", "Toyota", 2005, 7000, true, "White", "Patel", "EX-L", 2));
    sedList.add(new Sedan("Sedan", "BMW", 2017, 18000, true, "Blue", "Singh", "Base", 4));
    vehicleCount += tList.size() + suvList.size() + sedList.size();
    int choice = 0;
    while (alwaysT) {
      System.out.print(
          "Welcome to the dealership!\n\n1. Check Inventory\n2. Enter Car Bought\n3. Enter Car Sold\n4. Quit\n\nSelection---> ");
      try {
        choice = input.nextInt();
      } catch (InputMismatchException e) {
        if (input.next().isEmpty()) {
          continue;
        }
        System.out.print("Please enter a number from 1-4: ");
      }
      if (choice > 0 && choice < 5)
        switch (choice) {
          case 1:
            clearScreen();
            displayStock();
            break;
          case 2:
            clearScreen();
            getBought();
            System.out.print("\nCar successfully added to inventory.\n");
            vehicleCount += 1;
            break;
          case 3:
            clearScreen();
            getSold();
            break;
          case 4:
            System.exit(0);
            break;
        }
    }
  }
}