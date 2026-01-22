package com.stschool.java.basics;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte propertyRating, roadWidth, numberOfEntrances, plotOpenSides, projectArea;

        System.out.print("Enter Property Rating : ");
        propertyRating = sc.nextByte();

        System.out.print("Enter Road Width : ");
        roadWidth = sc.nextByte();

        System.out.print("Enter Number of Entrances : ");
        numberOfEntrances = sc.nextByte();

        System.out.print("Enter Plot Open Sides : ");
        plotOpenSides = sc.nextByte();

        System.out.print("Enter Project Area (Acres) : ");
        projectArea = sc.nextByte();

        short approvalYear, totalNumberOfPlots, distanceFromHighway, noOfAmenities;

        System.out.print("Enter Approval Year : ");
        approvalYear = sc.nextShort();

        System.out.print("Enter Total Number of Plots : ");
        totalNumberOfPlots = sc.nextShort();

        System.out.print("Enter Distance from Highway (meters) : ");
        distanceFromHighway = sc.nextShort();

        System.out.print("Enter Number of Amenities : ");
        noOfAmenities = sc.nextShort();


        int propertyId, ownerId, bookingAmount, registrationFee;

        System.out.print("Enter Property ID : ");
        propertyId = sc.nextInt();

        System.out.print("Enter Owner ID : ");
        ownerId = sc.nextInt();

        System.out.print("Enter Booking Amount : ");
        bookingAmount = sc.nextInt();

        System.out.print("Enter Registration Fee : ");
        registrationFee = sc.nextInt();

        long totalAmount, ownerPhoneNumber, agentPhoneNumber, userPhoneNumber;

        System.out.print("Enter Total Property Amount : ");
        totalAmount = sc.nextLong();

        System.out.print("Enter Owner Phone Number : ");
        ownerPhoneNumber = sc.nextLong();

        System.out.print("Enter Agent Phone Number : ");
        agentPhoneNumber = sc.nextLong();

        System.out.print("Enter User Phone Number : ");
        userPhoneNumber = sc.nextLong();

        float propertyInSqYards, distanceToCity, distanceToAirport, distanceToHighway;

        System.out.print("Enter Property Size (Sq Yards) : ");
        propertyInSqYards = sc.nextFloat();

        System.out.print("Enter Distance to City : ");
        distanceToCity = sc.nextFloat();

        System.out.print("Enter Distance to Airport : ");
        distanceToAirport = sc.nextFloat();

        System.out.print("Enter Distance to Highway : ");
        distanceToHighway = sc.nextFloat();

        double latitude, longitude, estimatedROI, rentalYield, taxPercentage, registrationPercentage;

        System.out.print("Enter Latitude : ");
        latitude = sc.nextDouble();

        System.out.print("Enter Longitude : ");
        longitude = sc.nextDouble();

        System.out.print("Enter Estimated ROI : ");
        estimatedROI = sc.nextDouble();

        System.out.print("Enter Rental Yield : ");
        rentalYield = sc.nextDouble();

        System.out.print("Enter Tax Percentage : ");
        taxPercentage = sc.nextDouble();

        System.out.print("Enter Registration Percentage : ");
        registrationPercentage = sc.nextDouble();

        char propertyStatus, facingDirection, approvalStatus, userType;

        System.out.print("Enter Property Status (A/S) : ");
        propertyStatus = sc.next().charAt(0);

        System.out.print("Enter Facing Direction (E/W/N/S) : ");
        facingDirection = sc.next().charAt(0);

        System.out.print("Enter Approval Status (Y/N) : ");
        approvalStatus = sc.next().charAt(0);

        System.out.print("Enter User Type (B/A) : ");
        userType = sc.next().charAt(0);

        boolean isAvailable, isSold, isUnderConstruction, isReadyToMove;

        System.out.print("Is Property Available (true/false) : ");
        isAvailable = sc.nextBoolean();

        System.out.print("Is Property Sold (true/false) : ");
        isSold = sc.nextBoolean();

        System.out.print("Is Under Construction (true/false) : ");
        isUnderConstruction = sc.nextBoolean();

        System.out.print("Is Ready To Move (true/false) : ");
        isReadyToMove = sc.nextBoolean();


        System.out.println("Property Rating : " + propertyRating);
        System.out.println("Road Width : " + roadWidth);
        System.out.println("Number of Entrances : " + numberOfEntrances);
        System.out.println("Plot Open Sides : " + plotOpenSides);
        System.out.println("Project Area : " + projectArea + " Acres");

        System.out.println("Approval Year : " + approvalYear);
        System.out.println("Total Number of Plots : " + totalNumberOfPlots);
        System.out.println("Distance from Highway : " + distanceFromHighway + " meters");
        System.out.println("Number of Amenities : " + noOfAmenities);

        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner ID : " + ownerId);
        System.out.println("Booking Amount : " + bookingAmount);
        System.out.println("Registration Fee : " + registrationFee);

        System.out.println("Total Property Amount : " + totalAmount);
        System.out.println("Owner Phone Number : " + ownerPhoneNumber);
        System.out.println("Agent Phone Number : " + agentPhoneNumber);
        System.out.println("User Phone Number : " + userPhoneNumber);

        System.out.println("Property Size : " + propertyInSqYards + " Sq Yards");
        System.out.println("Distance to City : " + distanceToCity);
        System.out.println("Distance to Airport : " + distanceToAirport);
        System.out.println("Distance to Highway : " + distanceToHighway);

        System.out.println("Latitude : " + latitude);
        System.out.println("Longitude : " + longitude);
        System.out.println("Estimated ROI : " + estimatedROI + "%");
        System.out.println("Rental Yield : " + rentalYield + "%");
        System.out.println("Tax Percentage : " + taxPercentage + "%");
        System.out.println("Registration Percentage : " + registrationPercentage + "%");

        System.out.println("Property Status : " + propertyStatus);
        System.out.println("Facing Direction : " + facingDirection);
        System.out.println("Approval Status : " + approvalStatus);
        System.out.println("User Type : " + userType);

        System.out.println("Available : " + isAvailable);
        System.out.println("Sold : " + isSold);
        System.out.println("Under Construction : " + isUnderConstruction);
        System.out.println("Ready To Move : " + isReadyToMove);

        sc.close();
    }
}
