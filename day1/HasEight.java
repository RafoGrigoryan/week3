package com.company.day1;

import java.util.Scanner;

public class HasEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(hasEight(num));

    }
    public static boolean hasEight(int num){
        String myStr = String.valueOf(num);
        int[] array = new int[myStr.length()];
        for (int i = 0; i < myStr.length(); i++) {
            array[i] = num%10;
            num = (num-array[i])/10;
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 8){
                k++;
            }
        }
        if(k > 0){
            System.out.println("number contains the digit 8 ?");
            return true;
        }
        else{
            System.out.println("number contains the digit 8 ?");
            return false;
        }
    }
}
