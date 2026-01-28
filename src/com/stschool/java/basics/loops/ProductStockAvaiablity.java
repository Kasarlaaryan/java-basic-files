package com.stschool.java.basics.loops;

import java.util.Scanner;

public class ProductStockAvaiablity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To My Ecom Portal ");
        System.out.println("Please Enter 1 for Products");
        System.out.println("Please Enter 2 for Exits");
        char menu, continueShopping;
        float centralTax, stateTax, afterDiscountPrice, centralTaxPercentage, stateTaxPercentage, totalAmount;
        int avaiableStock, originalProductPrice, shippingCharges;
        menu = sc.next().charAt(0);
        centralTaxPercentage = 2.5F;
        stateTaxPercentage = 2.5F;
        shippingCharges = 120;


        switch (menu) {
            case '1':
                System.out.println("Please Enter Your Product Price");
                originalProductPrice = sc.nextInt();
                avaiableStock = 10;

                while (avaiableStock > 0) {
                    centralTax = (originalProductPrice * centralTaxPercentage) / 100;
                    stateTax = (originalProductPrice * stateTaxPercentage) / 100;
                    totalAmount = originalProductPrice + centralTax + stateTax + shippingCharges;
                    System.out.println("=====================================================");
                    System.out.println("CGST Amount on the Product : " + centralTax);
                    System.out.println("SGST Amount of the Product : " + stateTax);
                    System.out.println("Shipping Charges : " + shippingCharges);
                    System.out.println("=====================================================");
                    System.out.println("Total Price Cost is : " + totalAmount);
                    System.out.println("=====================================================");

                    System.out.println("Stock Left : " + avaiableStock);


                System.out.println("Do you Want to Continue the Shopping ( Y/N ) :  ");
                continueShopping = sc.next().charAt(0);
                if (continueShopping == 'Y' || continueShopping == 'y') {
                    avaiableStock--;
                } else {
                    System.out.println("Thank you for shopping with us");
                    System.exit(0);

                }

                }

                if( avaiableStock == 0){
                System.out.println("No Stock Avaiable in the store");
            }



                break;

            case '2':
                System.out.println("You Are Exited from the Portal");
                System.exit(0);

            default:
                System.out.println("Invalid Input");

        }


        sc.close();
    }
}
