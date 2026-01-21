package com.stschool.java.basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Property_details_
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
        System.out.println("Registration Fee : "+ registrationFee);
        System.out.println("Booking Amount : " + bookingAmount);






        sc.close();


    }
}
