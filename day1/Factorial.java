package com.company.day1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("fac = "+factorial(a));
    }
    public static int factorial(int a){
        for (int i = a-1; i > 0; i--) {
            a = a*i;
        }
        if(a>0){
            return a;
        }else{
            return 0;
        }
    }
}
