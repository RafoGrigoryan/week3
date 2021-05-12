package com.company.day1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double  a = scanner.nextDouble();
       int n = scanner.nextInt();
        System.out.println(pow(a,n));
    }
    public static double pow(double a, int n){
        double res = a;
        if(n==0){
            a = 1;
        }else {
            for (int i = 2; i <= n; i++) {
                a = a * res;

            }
        }
        return a;
    }
}
