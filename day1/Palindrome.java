package com.company.day1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();
        System.out.println(palindrome(myStr));
    }
    public static boolean palindrome(String num){
        int[] array = new int[num.length()];
        int myInt = Integer.parseInt(num);
        int x = 0;
        int k = 0;
        for (int i = 0; i < num.length(); i++) {
            x = myInt%10;
            array[i] = x;
            myInt = (myInt-x)%10;
        }
        for (int i = 0; i <= array.length/2; i++) {
            if(array[i] == array[array.length-1-i]){
               k++;
            }
        }
        if(k == array.length/2){
            System.out.println("num is palindrom");
            return true;
        }
        else {
            System.out.println("num is not palindrom");
            return false;
        }
    }
}
