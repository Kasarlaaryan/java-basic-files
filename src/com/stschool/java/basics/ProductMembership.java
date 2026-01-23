package com.stschool.java.basics;

import java.util.Scanner;

public class ProductMembership {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productPrice, shippingCharges;
        char membership;
        float stateTaxPercentage, centralTaxPercentage, stateTax, centralTax,  productFinialPrice, afterdiscount, discountAmount;
        System.out.println("Please Enter the Product Price");
        productPrice = sc.nextInt();
        System.out.println("Please Enter Your Memebership Code : S , G , D ");
        membership = sc.next().charAt(0);
        stateTaxPercentage = 2.5F;
        centralTaxPercentage = 2.5F;
        productFinialPrice = 0;

        if (membership == 'S') {
            float discountPercentage;
            discountPercentage = 10;
            shippingCharges = 50;
            discountAmount = (productPrice * discountPercentage) / 100;
            afterdiscount = (float) (productPrice - discountAmount);
            stateTax = (float) (afterdiscount * stateTaxPercentage) / 100;
            centralTax = (float) (afterdiscount * centralTaxPercentage) / 100;

            productFinialPrice = afterdiscount + stateTax + centralTax + shippingCharges;

        } else if (membership==  'G'){
            float discountPercentage;
            discountPercentage = 20;
            shippingCharges = 30;
            discountAmount = (productPrice * discountPercentage) / 100;
            afterdiscount = (float) (productPrice - discountAmount);
            stateTax = (float) (afterdiscount * stateTaxPercentage) / 100;
            centralTax = (float) (afterdiscount * centralTaxPercentage) / 100;

            productFinialPrice = afterdiscount + stateTax + centralTax + shippingCharges;

        }else if  (membership == 'D'){
            float discountPercentage;
            discountPercentage = 40;
            shippingCharges = 0;
            discountAmount = (productPrice * discountPercentage) / 100;
            afterdiscount = (float) (productPrice - discountAmount);
            stateTax = (float) (afterdiscount * stateTaxPercentage) / 100;
            centralTax = (float) (afterdiscount * centralTaxPercentage) / 100;

            productFinialPrice = afterdiscount + stateTax + centralTax + shippingCharges;
        }else {
            float discountPercentage;
            discountPercentage = 0;
            shippingCharges = 100;
            discountAmount = (productPrice * discountPercentage) / 100;
            afterdiscount = (float) (productPrice - discountAmount);
            stateTax = (float) (afterdiscount * stateTaxPercentage) / 100;
            centralTax = (float) (afterdiscount * centralTaxPercentage) / 100;

            productFinialPrice = afterdiscount + stateTax + centralTax + shippingCharges;
        }
        System.out.println("Original Product of the product = "  + productPrice);
        System.out.println("Discount Amount on this Product = " + discountAmount);
        System.out.println("SGST Amount on the Product = " + centralTax);
        System.out.println("CGST Amount on the Product = " + stateTax);
        System.out.println("Shipping Charges = "+ shippingCharges);
        System.out.println("Total Amount of the Product = "+ productFinialPrice );







//        Original Price of the Product : 222
//
//        CGST Amount on the Product : 4.3290005
//        SGST Amount of the Product : 4.3290005
//
//        Savage on this product is : 173.16


                sc.close();
    }
}
