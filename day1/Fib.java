package com.company.day1;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("Fib = "+fib(n));
    }
    public static int fib(int n){
        int F = 0;
        int sum = 1;
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = F;
            F = F + sum;
            sum = res;
        }
        return F;
    }
}
