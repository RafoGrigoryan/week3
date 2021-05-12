package com.company.day1;

import java.util.Scanner;

public class Students {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("size = ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        students(arr,n);

    }
    public static void students(int[] arr,int n){

        for (int i = 0; i < arr.length; i++) {
            System.out.print("array ["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        double averages = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
            sum+= arr[i];
        }
        averages = (double) sum/n;
        System.out.println("averages = "+averages+"\n"+"minimum = "+min+"\n"+"maximum = "+max);
    }
}
