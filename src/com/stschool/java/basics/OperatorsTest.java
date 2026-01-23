package com.stschool.java.basics;

import java.util.Scanner;

public class OperatorsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = 10;
        int no2 = 20;

        int res = no1++ - --no2 + no2-- * ++no1 + --no1;
        System.out.println(res);

        no1 = 10;
        no2 = 20;

        res = no1 + no2 - 30 * 40 / 50 % 60;
        System.out.println(res);
        res = no1 + (no2 - 30) * 40 / 50 % 60;
        System.out.println(res);


        no1 = 10;
//        System.out.println(no1++ > 10 && ++no1 > 5);
        System.out.println(no1++ > 10 & ++no1 > 5);

        System.out.println(no1);


        sc.close();
    }
}
