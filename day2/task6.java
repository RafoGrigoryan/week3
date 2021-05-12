package com.company.day2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 = ");
        int num1 = scanner.nextInt();
        System.out.println("circle area = "+square(num1));
        System.out.print("num2 = ");
        float num2 = scanner.nextFloat();
        System.out.println("square area = "+square(num2));
        System.out.println("rectangle area = "+square(num1,num2));

    }
    public static double square(int radius){
        return Math.PI*radius*radius;
    }
    public static double square(float num2){
        return num2*num2;
    }
    public static double square(int num1,float num2){
        return num1*num2;
    }

}
