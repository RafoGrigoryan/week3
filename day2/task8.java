package com.company.day2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("distance = "+distance(x1,y1));
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.println("distance = "+distance(x1,x2,y1,y2));

    }
    public static double distance(int  x1,int y1){
        return Math.sqrt(x1*x1+y1*y1);
    }
    public static double distance(int x1,int x2,int y1,int y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }

}
