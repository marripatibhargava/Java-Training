package com.company;

import com.company.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 6, 8, 8, 17);
        Triangle triangleB = new Triangle(3, 9, 17, 6, 4);

        double triangleAArea =triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea =triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenOne);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);

    }
}