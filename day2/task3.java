package com.company.day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("num2 = ");
        int num2 = scanner.nextInt();
        System.out.print("my float = ");
        float myFloat = scanner.nextFloat();
       System.out.println(returnol(num1,num2));
        System.out.println(returnol(num1,myFloat));
    }
    public static int returnol(int num1,int num2 ){
      return  num1+num2;
    }
    public static float returnol(int num1,float myFloat){
        return num1/myFloat;
    }
}

