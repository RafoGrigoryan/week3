package com.company.day1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();
        char myChar = myStr.charAt(0);
        System.out.println(vowel(myChar));
    }
    public static boolean vowel(char myChar){
        if(myChar == 65 || myChar == 97 || myChar == 69 || myChar == 101 || myChar == 73 ||myChar == 105 || myChar == 79 || myChar == 111 || myChar == 85 || myChar == 117){
            System.out.println("let is vowel");
            return true;
        }else {
            System.out.println("let is not vowel");
            return false;
        }
    }
}
