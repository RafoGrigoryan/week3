package com.company.day2;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("index = ");
        int index = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3);
        }
        System.out.println("array length = " + search(arr));
        System.out.println("index = " + search(arr, a));
        System.out.println("boolean " + search(arr, a,index));
    }

    public static int search(int[] arr) {

        return arr.length;
    }

    public static int search(int[] arr, int a) {
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                k = i;
                break;
            }
        }
        return k;
    }

    public static boolean search(int[] arr, int a, int index) {
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                k = i;
                break;
            }
        }
        if(k==index){
            return true;
        }else{
            return false;
        }
    }
}


