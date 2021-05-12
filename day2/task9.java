package com.company.day2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("celsius = ");
        int celsius = scanner.nextInt();
        System.out.println(fahrenheitCelsius(celsius,1.0f));
        System.out.print("float celsius = ");
        float floatCelsius = scanner.nextFloat();
        System.out.println(fahrenheitCelsius(floatCelsius,2));

    }
    public static int fahrenheitCelsius(int celsius, float num){
        return  9*celsius/5+32;
    }
    public static double fahrenheitCelsius(float celsius, int num){
        return  9*celsius/5+32;
    }
}
