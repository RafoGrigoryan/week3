package com.company.day1;

import java.util.Scanner;

public class ContainsBool {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("size = ");
        int size = scanner.nextInt();
        System.out.print("key = ");
        int key = scanner.nextInt();

        int[] array = new int[size];
        System.out.println(contains(array,key));
    }
    public static boolean contains(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            System.out.print("array ["+i+"]= ");
            array[i] = scanner.nextInt();
        }
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                k++;
            }
        }
        if(k>0){
            return true;
        }else {
            return false;
        }
    }
}
