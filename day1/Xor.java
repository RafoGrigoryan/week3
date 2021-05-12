package com.company.day1;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bool1 = ");
        boolean value1 = scanner.nextBoolean();
        System.out.print("bool2 = ");
        boolean value2 = scanner.nextBoolean();
        System.out.println(xor(value1, value2));
    }
    public static boolean xor(boolean value1,boolean value2){
        if(value1 == value2){
            return false;
        }else{
            return true;
        }
    }
}
