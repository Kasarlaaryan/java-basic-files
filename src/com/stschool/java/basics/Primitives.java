package com.stschool.java.basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      _Property_details_
        byte propertyRating, roadWidth, numberOfEntrances, plotOpenSides, projectAera;
        propertyRating = 4;
        roadWidth = 45;
        numberOfEntrances = 5;
        plotOpenSides = 3;
        projectAera = 75;
        System.out.println("Rating of the Project : " + propertyRating);
        System.out.println("Road width of the project : " + roadWidth);
        System.out.println("Number of the Entrance in the Project : " + numberOfEntrances);
        System.out.println("Open Sides of the plots : " + plotOpenSides);
        System.out.println("Project Area : " + projectAera + " Acres");

        short approvalYear, totalNumberOfPlots, distanceFromHighway, noOfAmenities;
        approvalYear = 2024;
        totalNumberOfPlots = 225;
        distanceFromHighway = 350;
        noOfAmenities = 180;
        System.out.println("Project Approval Year :" + approvalYear);
        System.out.println("Total Number Of the Plots in the Project :" + totalNumberOfPlots);
        System.out.println("Distance from the Highway to the Project : " + distanceFromHighway);
        System.out.println("Number of Amenities in the project : " + noOfAmenities);

        int propertyId, ownerId, bookingAmount, registrationFee;
        propertyId = 1212;
        ownerId = 21332;
        bookingAmount = 600000;
        registrationFee = 56565;
        System.out.println("Property Id : " + propertyId);
        System.out.println("Owner Id : " + ownerId);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println("Booking Amount : " + bookingAmount);

        long totalAmount, ownerPhoneNumber, agentPhoneNumber, userPhoneNumber;
        totalAmount = 2323232323L;
        ownerPhoneNumber = 99899898989L;
        agentPhoneNumber = 28382323232L;
        userPhoneNumber = 23324343433L;
        System.out.println("Total Amount of the Property : " + totalAmount);
        System.out.println("Property Owner Number : " + ownerPhoneNumber);
        System.out.println("Property Agent Number : " + agentPhoneNumber);
        System.out.println("Request Phone Number of the user :" + userPhoneNumber);

        float propertyInSqYards, distanceToCity, distanceToAirport, distanceToHighway;
        propertyInSqYards = 122.5F;
        distanceToAirport = 35.2F;
        distanceToCity = 12.3F;
        distanceToHighway = 10.3F;
        System.out.println("Property size in Yards : " + propertyInSqYards);
        System.out.println("Distance from Airport to Project :" + distanceToAirport);
        System.out.println("Distance from City to Project : " + distanceToCity);
        System.out.println("Distance from National Highway : " + distanceToHighway);

        double latitude, longitude, estimatedROI, rentalYield, taxPercentage, registrationPercentage;
        latitude = 17.254321;
        longitude = 78.396845;
        estimatedROI = 12.75;
        rentalYield = 4.50;
        taxPercentage = 6.00;
        registrationPercentage = 7.00;
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(estimatedROI);
        System.out.println( rentalYield);
        System.out.println(taxPercentage);
        System.out.println(registrationPercentage);

        char propertyStatus, facingDirection, approvalStatus,userType;
        propertyStatus = 'A';
        facingDirection = 'E';
        approvalStatus = 'Y';
        userType = 'B';
        System.out.println(propertyStatus);
        System.out.println(facingDirection);
        System.out.println(approvalStatus);
        System.out.println( userType);

        boolean isAvailable, isSold, isUnderConstruction, isReadyToMove;
        isAvailable = true;
        isSold= false;
        isUnderConstruction=true;
        isReadyToMove=true;
        System.out.println(isAvailable);
        System.out.println(isSold);
        System.out.println(isUnderConstruction);
        System.out.println(isReadyToMove);
        sc.close();
    }
}
