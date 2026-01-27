package com.stschool.java.basics;

import java.util.Scanner;

public class ProductPriceMembership {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productPrice, shippingCharges;
        char membership;
        float stateTaxPercentage, centralTaxPercentage, discountPercentage, stateTax, centralTax,  productFinialPrice, priceAfterDiscount, discountAmount;
        System.out.println("Please Enter the Product Price");
        productPrice = sc.nextInt();
        System.out.println("Please Enter Your Membership Code : S , G , D (please Enter Capital Letters Only) ");
        membership = sc.next().charAt(0);
        stateTaxPercentage = 2.5F;
        centralTaxPercentage = 2.5F;

        switch (membership){
            case 'S':
                discountPercentage = 10;
                shippingCharges = 50;
                break;
            case 'G' :

                discountPercentage = 20;
                shippingCharges = 30;
                break;
            case 'D' :
                discountPercentage = 40;
                shippingCharges = 0;
                break;
            default:
                discountPercentage = 0;
                shippingCharges = 100;
            }

        discountAmount = (productPrice * discountPercentage) / 100;
        priceAfterDiscount = (float) (productPrice - discountAmount);
        stateTax = (float) (priceAfterDiscount * stateTaxPercentage) / 100;
        centralTax = (float) (priceAfterDiscount * centralTaxPercentage) / 100;
        productFinialPrice = priceAfterDiscount + stateTax + centralTax + shippingCharges;


        System.out.println("Original Product of the product = "  + productPrice);
        System.out.println("Discount Amount on this Product = " + discountAmount);
        System.out.println("SGST Amount on the Product = " + centralTax);
        System.out.println("CGST Amount on the Product = " + stateTax);
        System.out.println("Shipping Charges = "+ shippingCharges);
        System.out.println("Total Amount of the Product = "+ productFinialPrice );
        sc.close();
    }

}