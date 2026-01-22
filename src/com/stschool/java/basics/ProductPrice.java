package com.stschool.java.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity, priceAfterDiscount;
        float discountPercentage,discountAmount,finialBill, totalsavage,  afterDiscountPrice, stateTaxPercentage, centralTax,stateTax, centralTaxPercentage, totalPrice;
        centralTaxPercentage = 2.5F;
        stateTaxPercentage = 2.5F;
        System.out.println("Please Enter the Price of the Product : ");
        productPrice = sc.nextInt();
        System.out.println("Please Enter the Discount Percentage");
        discountPercentage = sc.nextFloat();
        discountAmount = (float) (productPrice*discountPercentage)/100;
        afterDiscountPrice = (float) (productPrice -discountAmount);
        centralTax= (afterDiscountPrice * centralTaxPercentage)/100;
        stateTax = (afterDiscountPrice * stateTaxPercentage)/100;
        totalPrice = afterDiscountPrice + centralTax + stateTax;


        System.out.println("=====================================================");
        System.out.println("Original Price of the Product : " + productPrice);
        System.out.println("Discount Amount on this Product : " + discountAmount);
        System.out.println("CGST Amount on the Product : " + centralTax);
        System.out.println("SGST Amount of the Product : " + stateTax);
        System.out.println("Total Amount of the Product : " + totalPrice);
        System.out.println("Savage on this product is : " + afterDiscountPrice);
        System.out.println("Please Enter Number of Quantity Required : " );
        quantity = sc.nextInt();
        finialBill = quantity * totalPrice;
        totalsavage= quantity * afterDiscountPrice;
        System.out.println("Total Number of the Quantity is : " + quantity);
        System.out.println("Finial Price of the Product for " + quantity + " is : " +  finialBill );
        System.out.println("Total Savage on this product for " + quantity + " is " + totalsavage );
        System.out.println("=====================================================================");





        sc.close();
    }
}
