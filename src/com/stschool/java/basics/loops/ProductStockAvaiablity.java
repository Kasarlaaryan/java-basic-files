package com.stschool.java.basics.loops;

import java.util.Scanner;

public class ProductStockAvaiablity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To My Ecom Portal ");
        System.out.println("Please Enter 1 for Products");
        System.out.println("Please Enter 2 for Exits");
        char menu;
        int avaiableStock, originalProductPrice ;
        menu=sc.next().charAt(0);

        switch (menu){
            case '1':
                System.out.println("Please Enter Your Product Price");
                originalProductPrice = sc.nextInt();
                avaiableStock = 10;
                int i = 1;






                    break;
            case '2':
                System.out.println("You Are Exited from the Portal");
                System.exit(0);
        }




        sc.close();
    }
}
