package com.company.day2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num = ");
        int num = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        System.out.println("sum = "+reminder(num));
        System.out.println("sum%k = "+reminder(num,k));
    }
    public static int reminder(int num){
        String myStr = String.valueOf(num);
        int sum = 0;
        int x = 0;
        for (int i = 0; i <myStr.length() ; i++) {
            x = num%10;
            sum+= x;
            num = (num-x)/10;
        }
        return sum;
    }
    public static int reminder(int num,int k){
        String myStr = String.valueOf(num);
        int sum = 0;
        int x = 0;
        for (int i = 0; i <myStr.length() ; i++) {
            x = num%10;
            sum+= x;
            num = (num-x)/10;
        }
        return sum%k;
    }
}
