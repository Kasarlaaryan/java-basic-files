package com.stschool.java.basics;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class SalaryCalcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctc, monthlyAmount, basic, proffesionalTax, insuranceAmount, employeePF, employerPF;
        byte percentage, daPercentage, hraPercentage, employeePFPercentage, employerPFPercentage, year;
        double da, hra, grossSalary, deductions, netPayAmount, yearlyNetPay, yearlyDeducations;
        System.out.println("Please Enter the CTC of the Person");
        ctc = sc.nextInt();
        percentage = 50;
        monthlyAmount = ctc/12;
        basic = (monthlyAmount * percentage) / 100;
        daPercentage = 20;
        hraPercentage = 10;
        da = (double) (basic * daPercentage) / 100;
        hra = (double) (basic * hraPercentage) / 100;
        grossSalary = basic + da + hra;

        employerPFPercentage = 12;
        employeePFPercentage = 12;
        employeePF = (basic * employeePFPercentage)/100;
        employerPF = (basic * employerPFPercentage)/100;
        proffesionalTax = 200;
        insuranceAmount = 1000;
        year = 12;

        deductions = employeePF + employerPF + proffesionalTax + insuranceAmount;
        netPayAmount = grossSalary - deductions;
        yearlyDeducations = deductions * year;
        yearlyNetPay = netPayAmount * year;


        System.out.println("==============================================");
        System.out.println("Basic Amount  : " + basic);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("-----------------------------------------------");
        System.out.println("Deductions");
        System.out.println("Employee PF : " + employeePF);
        System.out.println("Employer PF : " + employerPF);
        System.out.println("Professional Tax : " + proffesionalTax);
        System.out.println("Insurance Amount  : " + insuranceAmount);
        System.out.println("Total Deductions : " + deductions);
        System.out.println("-------------------------------------------------");
        System.out.println("Net Pay Amount : " + netPayAmount);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Deducations in a Year : " + yearlyDeducations);
        System.out.println("Total Net Pay In the Year : " + yearlyNetPay);
        System.out.println("-----------------------------------------------------");
        System.out.println("Monthly Amount Based on CTC without Deductions  : " + monthlyAmount);
        sc.close();

    }


}
