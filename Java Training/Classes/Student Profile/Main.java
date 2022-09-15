package com.company;

public class Main {

    public static void main(String[] args) {
        // create two student profile instances
        StudentProfile profileOne = new StudentProfile("Bhargava", "marripati", "Mechancial Engineering", 3.8, 2016);
        StudentProfile profiletwo = new StudentProfile("Rajesh", "Yathi", "Computer Science", 3.5, 2015);

        profiletwo.incremenetExpectedYearToGraduate();
        System.out.println(profiletwo.expectedYearToGraduate);

    }
}