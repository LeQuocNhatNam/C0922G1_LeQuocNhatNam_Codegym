package services.impl;

import com.sun.corba.se.impl.interceptors.PICurrent;
import sun.dc.pr.PRError;

public class FacilityValidation {
    private final static String VILLA_SERVICE_ID_REGEX = "^SVVL-\\d{4}$";
    private final static String ROOM_SERVICE_ID_REGEX = "^SVRO-\\d{4}$";
    private final static String SERVICE_NAME_REGEX = "^([A-Z])";
    private final static String POOL_SQUARE_REGEX = "(^3[1-9]$)|(^[4-9][0-9]$)|(\\d{2}\\d+$)";
    private final static String RENTAL_COST_REGEX = "^(0*[1-9][0-9]*(\\.[0-9]+)?|0+\\.[0-9]*[1-9][0-9]*)$";
    private final static String MAX_NUMBER_PEOPLE_REGEX = "(^0*[1-9]$)|(\\b0*1\\d\\b)|(\\b0*20\\b)";
    private final static String NUMBER_OF_STORIES_REGEX = "^0*[1-9]+";
    private final static String ROOM_STANDARD_REGEX = "^([A-Z])";
    private final static String DATE_OF_BIRTH_REGEX = "";

    public static boolean validateVillaServiceID(String serviceID) {
        return serviceID.matches(VILLA_SERVICE_ID_REGEX);
    }

    public static boolean validateRoomServiceID(String serviceID) {
        return serviceID.matches(ROOM_SERVICE_ID_REGEX);
    }

    public static boolean validateServiceName(String serviceName) {
        return serviceName.matches(SERVICE_NAME_REGEX);
    }

    public static boolean validatePoolSquare(String poolSquare) {
        return poolSquare.matches(POOL_SQUARE_REGEX);
    }

    public static boolean validateRentalCost(String rentalCost) {
        return rentalCost.matches(RENTAL_COST_REGEX);
    }

    public static boolean validateMaxNumberPeople(String maxNumberPeople) {
        return maxNumberPeople.matches(MAX_NUMBER_PEOPLE_REGEX);
    }

    public static boolean validateNumberOfStories(String numberOfStories) {
        return numberOfStories.matches(NUMBER_OF_STORIES_REGEX);
    }

    public static boolean validateRoomStandard(String roomStandard) {
        return roomStandard.matches(ROOM_STANDARD_REGEX);
    }


}
