package views;

import controllers.FacilityController;
import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import java.util.List;
import java.util.Scanner;

public class FacilityView {
    private static Scanner input = new Scanner(System.in);
    private static FacilityController facilityController = new FacilityController();

    public static void displayFacilityMenu() {
        do {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display facility maintenance");
            System.out.println("4. Return main menu");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    List<Facility> facilityList = facilityController.getFacilityList();
                    if (facilityList.size() == 0) {
                        System.out.println("empty list!");
                        break;
                    }
                    for (Facility facility : facilityList) {
                        System.out.println(facility.toString());
                    }
                    break;
                case 2:
                    System.out.println("Please enter facility's information:");
                    System.out.println("Enter service: ");
                    System.out.println("1. Add room");
                    System.out.println("2. Add villa");
                    System.out.println("3. Back to menu");
                    int serviceChoice = Integer.parseInt(input.nextLine());
                    if (serviceChoice == 1) {
                        System.out.println("enter service ID");
                        String serviceID = input.nextLine();
                        System.out.println("enter service name:");
                        String serviceName = input.nextLine();
                        System.out.println("enter square:");
                        double square = Double.parseDouble(input.nextLine());
                        System.out.println("enter rental cost");
                        double rentalCost = Double.parseDouble(input.nextLine());
                        System.out.println("enter maximum number of people:");
                        int maxNumberPeople = Integer.parseInt(input.nextLine());
                        System.out.println("enter rental type: month/year/day");
                        String rentalType = input.nextLine();
                        System.out.println("enter free service included:");
                        String freeServiceIncluded = input.nextLine();
                        Facility room = new Room(serviceID,serviceName, square, rentalCost, maxNumberPeople, rentalType, freeServiceIncluded);
                        int usedTimes = 0;
                        facilityController.addFacility(room, usedTimes);
                    }
                    if (serviceChoice == 2) {
                        System.out.println("enter service ID");
                        String serviceID = input.nextLine();
                        System.out.println("enter service name:");
                        String serviceName = input.nextLine();
                        System.out.println("enter square:");
                        double square = Double.parseDouble(input.nextLine());
                        System.out.println("enter rental cost");
                        double rentalCost = Double.parseDouble(input.nextLine());
                        System.out.println("enter maximum number of people:");
                        int maxNumberPeople = Integer.parseInt(input.nextLine());
                        System.out.println("enter rental type: month/year/day");
                        String rentalType = input.nextLine();
                        //String roomStandard, double poolSquare, int floorNumber
                        System.out.println("enter room standard: ");
                        String roomStandard = input.nextLine();
                        System.out.println("enter pool square:");
                        double poolSquare = Double.parseDouble(input.nextLine());
                        System.out.println("enter number of stories:");
                        int numberOfStories = Integer.parseInt(input.nextLine());
                        Facility villa = new Villa(serviceID,serviceName, square, rentalCost,
                                maxNumberPeople, rentalType, roomStandard, poolSquare, numberOfStories);
                        int usedTimes = 0;
                        facilityController.addFacility(villa, usedTimes);
                    }
                    if (serviceChoice == 3){
                        break;
                    }
                    System.out.println("invalid choice!");
                    break;
                case 3:
                    List<Facility> facilities = facilityController.getMaintenanceList();
                    if (facilities.size() == 0) {
                        System.out.println("empty maintenance list!");
                        break;
                    }
                    for (Facility facility : facilities) {
                        System.out.println(facility.toString());
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
