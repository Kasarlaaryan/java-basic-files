package com.stschool.java.basics;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- BYTE --------
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

        // -------- SHORT --------
        short approvalYear, totalNumberOfPlots, distanceFromHighway, noOfAmenities;

        System.out.print("Enter Approval Year : ");
        approvalYear = sc.nextShort();

        System.out.print("Enter Total Number of Plots : ");
        totalNumberOfPlots = sc.nextShort();

        System.out.print("Enter Distance from Highway (meters) : ");
        distanceFromHighway = sc.nextShort();

        System.out.print("Enter Number of Amenities : ");
        noOfAmenities = sc.nextShort();

        // -------- INT --------
        int propertyId, ownerId, bookingAmount, registrationFee;

        System.out.print("Enter Property ID : ");
        propertyId = sc.nextInt();

        System.out.print("Enter Owner ID : ");
        ownerId = sc.nextInt();

        System.out.print("Enter Booking Amount : ");
        bookingAmount = sc.nextInt();

        System.out.print("Enter Registration Fee : ");
        registrationFee = sc.nextInt();

        // -------- LONG --------
        long totalAmount, ownerPhoneNumber, agentPhoneNumber, userPhoneNumber;

        System.out.print("Enter Total Property Amount : ");
        totalAmount = sc.nextLong();

        System.out.print("Enter Owner Phone Number : ");
        ownerPhoneNumber = sc.nextLong();

        System.out.print("Enter Agent Phone Number : ");
        agentPhoneNumber = sc.nextLong();

        System.out.print("Enter User Phone Number : ");
        userPhoneNumber = sc.nextLong();

        // -------- FLOAT --------
        float propertyInSqYards, distanceToCity, distanceToAirport, distanceToHighway;

        System.out.print("Enter Property Size (Sq Yards) : ");
        propertyInSqYards = sc.nextFloat();

        System.out.print("Enter Distance to City : ");
        distanceToCity = sc.nextFloat();

        System.out.print("Enter Distance to Airport : ");
        distanceToAirport = sc.nextFloat();

        System.out.print("Enter Distance to Highway : ");
        distanceToHighway = sc.nextFloat();

        // -------- DOUBLE --------
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

        // -------- CHAR --------
        char propertyStatus, facingDirection, approvalStatus, userType;

        System.out.print("Enter Property Status (A/S) : ");
        propertyStatus = sc.next().charAt(0);

        System.out.print("Enter Facing Direction (E/W/N/S) : ");
        facingDirection = sc.next().charAt(0);

        System.out.print("Enter Approval Status (Y/N) : ");
        approvalStatus = sc.next().charAt(0);

        System.out.print("Enter User Type (B/A) : ");
        userType = sc.next().charAt(0);

        // -------- BOOLEAN --------
        boolean isAvailable, isSold, isUnderConstruction, isReadyToMove;

        System.out.print("Is Property Available (true/false) : ");
        isAvailable = sc.nextBoolean();

        System.out.print("Is Property Sold (true/false) : ");
        isSold = sc.nextBoolean();

        System.out.print("Is Under Construction (true/false) : ");
        isUnderConstruction = sc.nextBoolean();

        System.out.print("Is Ready To Move (true/false) : ");
        isReadyToMove = sc.nextBoolean();

        sc.close();
    }
}
