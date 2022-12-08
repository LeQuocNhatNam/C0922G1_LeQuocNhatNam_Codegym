package views;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import controllers.FacilityController;
import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.impl.FacilityValidation;

import java.util.List;
import java.util.Map;
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
                    Map<Facility,Integer> map = facilityController.getFacilityList();

                    if (map.isEmpty()) {
                        System.out.println("empty list!");
                        break;
                    }
                    for (Map.Entry<Facility,Integer> entry: map.entrySet()) {
                        System.out.println(entry.getKey().toString() + " used" + entry.getValue());
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
                        System.out.println("Enter service ID: ");
                        String serviceID = input.nextLine();
                        while (!FacilityValidation.validateRoomServiceID(serviceID)) {
                            System.out.println("Invalid ID, enter again starting with SVRO followed by a dash and 4 digits:");
                            serviceID = input.nextLine();
                        }

                        System.out.println("enter service name:");
                        String serviceName = input.nextLine();
                        while (!FacilityValidation.validateServiceName(serviceName)) {
                            System.out.println("Invalid! Enter again starting with an uppercase letter");
                            serviceName = input.nextLine();
                        }
                        System.out.println("enter square:");
                        String squareString = input.nextLine();
                        while (!FacilityValidation.validatePoolSquare(squareString)) {
                            System.out.println("Invalid! enter a number greater than 30");
                            squareString = input.nextLine();
                        }
                        double square = Double.parseDouble(squareString);

                        System.out.println("enter rental cost");
                        String rentalCostString = input.nextLine();
                        while (!FacilityValidation.validateRentalCost(rentalCostString)) {
                            System.out.println("Invalid! Enter again an amount more than zero");
                            rentalCostString = input.nextLine();
                        }
                        double rentalCost = Double.parseDouble(rentalCostString);

                        System.out.println("enter maximum number of people:");
                        String maxNumberPeopleString = input.nextLine();
                        while (!FacilityValidation.validateMaxNumberPeople(maxNumberPeopleString)) {
                            System.out.println("Invalid! please enter again greater than zero and less than twenty");
                            maxNumberPeopleString = input.nextLine();
                        }
                        int maxNumberPeople = Integer.parseInt(maxNumberPeopleString);

                        System.out.println("enter rental type: month/year/day");
                        String rentalType = input.nextLine();
                        while (!FacilityValidation.validateRentalType(rentalType)) {
                            System.out.println("Invalid! enter again starting with an uppercase letter:");
                            rentalType = input.nextLine();
                        }

                        System.out.println("enter free service included:");
                        String freeServiceIncluded = input.nextLine();
                        while (!FacilityValidation.validateFreeService(freeServiceIncluded)) {
                            System.out.println("Invalid! Please enter again starting with an uppercase letter");
                            freeServiceIncluded = input.nextLine();
                        }
                        Facility room = new Room(serviceID, serviceName, square, rentalCost, maxNumberPeople, rentalType, freeServiceIncluded);
                        int usedTimes = 0;
                        facilityController.addFacility(room, usedTimes);
                        break;
                    }
                    if (serviceChoice == 2) {
                        System.out.println("enter service ID");
                        String serviceID = input.nextLine();
                        while (!FacilityValidation.validateVillaServiceID(serviceID)) {
                            System.out.println("Invalid! Enter again starting with SVVL-(4digits)");
                            serviceID = input.nextLine();
                        }
                        System.out.println("enter service name:");
                        String serviceName = input.nextLine();
                        while (!FacilityValidation.validateServiceName(serviceName)) {
                            System.out.println("Invalid! Enter again starting with an uppercase letter");
                            serviceName = input.nextLine();
                        }
                        System.out.println("enter square:");
                        String squareString = input.nextLine();
                        while (!FacilityValidation.validatePoolSquare(squareString)) {
                            System.out.println("Invalid! enter a number greater than 30");
                            squareString = input.nextLine();
                        }
                        double square = Double.parseDouble(squareString);

                        System.out.println("enter rental cost");
                        String rentalCostString = input.nextLine();
                        while (!FacilityValidation.validateRentalCost(rentalCostString)) {
                            System.out.println("Invalid! Enter again an amount more than zero");
                            rentalCostString = input.nextLine();
                        }
                        double rentalCost = Double.parseDouble(rentalCostString);

                        System.out.println("enter maximum number of people:");
                        String maxNumberPeopleString = input.nextLine();
                        while (!FacilityValidation.validateMaxNumberPeople(maxNumberPeopleString)) {
                            System.out.println("Invalid! please enter again greater than zero and less than twenty");
                            maxNumberPeopleString = input.nextLine();
                        }
                        int maxNumberPeople = Integer.parseInt(maxNumberPeopleString);

                        System.out.println("enter rental type: month/year/day");
                        String rentalType = input.nextLine();
                        while (!FacilityValidation.validateRentalType(rentalType)) {
                            System.out.println("Invalid! enter again starting with an uppercase letter:");
                            rentalType = input.nextLine();
                        }

                        System.out.println("enter room standard: ");
                        String roomStandard = input.nextLine();
                        while (!FacilityValidation.validateRoomStandard(roomStandard)) {
                            System.out.println("Invalid! enter again starting with an uppercase letter:");
                            roomStandard = input.nextLine();
                        }

                        System.out.println("enter pool square:");
                        String poolSquareString = input.nextLine();
                        while (!FacilityValidation.validatePoolSquare(poolSquareString)) {
                            System.out.println("Invalid! enter a number greater than 30");
                            poolSquareString = input.nextLine();
                        }
                        double poolSquare = Double.parseDouble(poolSquareString);
                        System.out.println("enter number of stories:");
                        String numberOfStoriesString = input.nextLine();
                        while (FacilityValidation.validateNumberOfStories(numberOfStoriesString)) {
                            System.out.println("Invalid! enter again a number greater than zero");
                            numberOfStoriesString = input.nextLine();
                        }
                        int numberOfStories = Integer.parseInt(numberOfStoriesString);

                        Facility villa = new Villa(serviceID, serviceName, square, rentalCost,
                                maxNumberPeople, rentalType, roomStandard, poolSquare, numberOfStories);

                        int usedTimes = 0;
                        facilityController.addFacility(villa, usedTimes);

                    }
                    if (serviceChoice == 3) {
                        break;
                    }
                    System.out.println("invalid choice!");
                    break;
                case 3:
                    Map<Facility,Integer> map1 = facilityController.getMaintenanceList();
                    if (map1.isEmpty()) {
                        System.out.println("empty maintenance list!");
                        break;
                    }
                    for (Map.Entry<Facility,Integer> entry: map1.entrySet()) {
                        System.out.println(entry.getKey().toString() + " used " + entry.getValue());
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
