package com.stschool.java.basics;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte subject1Score, subject2Score, subject3Score, subject4Score, subject5Score, subject6Score;
        System.out.println("Enter the Marks Of 1st Language Score ");
        subject1Score = sc.nextByte();
        System.out.println("Enter the Marks of 2nd Language Score");
        subject2Score = sc.nextByte();
        System.out.println("Enter the Marks of the 3rd Language Score");
        subject3Score = sc.nextByte();
        System.out.println("Enter the Marks of the Maths Score");
        subject4Score = sc.nextByte();
        System.out.println("Enter the Marks of the Science Score");
        subject5Score = sc.nextByte();
        System.out.println("Enter the Marks of the Social Score");
        subject6Score = sc.nextByte();
        short totalScore;
        totalScore = (short) (subject1Score + subject2Score + subject3Score + subject4Score + subject5Score + subject6Score);
        double avg;
        avg = (double)totalScore / 6;
        System.out.println("Total Marks Of the Student : " + totalScore);
        System.out.println("Average Score of the Student : " + avg);
        sc.close();
    }
}


