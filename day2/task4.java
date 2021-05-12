package com.company.day2;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[] arrInt = new int[n];
        float[] arrFloat = new float[n];
        double[] arrDouble = new double[n];
        System.out.println("integer array");
        function(arrInt);
        System.out.println();
        System.out.println("float array");
        function(arrFloat);
        System.out.println();
        System.out.println("double array");
        function(arrDouble);
    }
    public static void function (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("array ["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(" "+arr[i]+" ]");
            }else if(i==0) {
                System.out.print("[ "+arr[i]+",");
            }else {
                    System.out.print(" "+ arr[i]+",");
                }
            }
        }
    public static void function (float[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("array ["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(" "+arr[i]+" ]");
            }else if(i==0) {
                System.out.print("[ "+arr[i]+",");
            }else {
                System.out.print(" "+ arr[i]+",");
            }
        }
    }
    public static void function (double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("array ["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(" "+arr[i]+" ]");
            }else if(i==0) {
                System.out.print("[ "+arr[i]+",");
            }else {
                System.out.print(" "+ arr[i]+",");
            }
        }
    }
    }
