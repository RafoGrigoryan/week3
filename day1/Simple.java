package com.company.day1;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();
        System.out.println("num is simple  "+simple(num));

    }
    public static boolean simple(double num){
        boolean myBool = true;
        if(num>1 && num<20000000){
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i == 0){
                   myBool = false;
                }
            }
        }
        if(myBool == false){
            return false;
        }else{
            return true;
        }
    }
}
