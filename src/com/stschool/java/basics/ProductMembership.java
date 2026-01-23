package com.stschool.java.basics;

import java.util.Scanner;

public class ProductMembership {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productPrice;
        char membership;
        double stateTaxPercentage, centralTaxPercentage, stateTax, centralTax, productFinialPrice;
        System.out.println("Please Enter the Product Price");
        productPrice = sc.nextInt();
        System.out.println("Please Enter Your Memebership Code : S , G , D ");
        membership = sc.next().charAt(0);
        stateTaxPercentage = 2.5;
        centralTaxPercentage = 2.5;
        productFinialPrice = 0;

        if (membership == 's') {
            float discountPercentage, afterdiscount, discountAmount;
            int shippingCharges;
            discountPercentage = 10;
            shippingCharges = 50;
            discountAmount = (productPrice * discountPercentage) / 100;
            afterdiscount = (float) (productPrice - discountAmount);
            stateTax = (float) (afterdiscount * stateTaxPercentage) / 100;
            centralTax = (float) (afterdiscount * centralTaxPercentage) / 100;

            productFinialPrice = afterdiscount + stateTax + centralTax + shippingCharges;

        } else {


        }


        System.out.println(productFinialPrice);
        sc.close();
    }
}
