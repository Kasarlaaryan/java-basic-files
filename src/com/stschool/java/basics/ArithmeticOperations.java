package com.stschool.java.basics;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte num1, num2;
        System.out.println("Enter a Number1 : ");
        num1 = sc.nextByte();
        System.out.println("Enter a Number2 :");
        num2 = sc.nextByte();
        short res;
        res = (short) (num1 + num2);
        System.out.println("Sum of Two Number : " + res);

        sc.close();

    }
}
