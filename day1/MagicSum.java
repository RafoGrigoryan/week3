package com.company.day1;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        int sum = 0;
        for(;;){
            num = scanner.nextInt();
            if(num == -1){
                break;
            }
            sum += sumEight(num);
        }
        System.out.println("sum eight = "+sum);

    }
    public static int sumEight(int num){
        int myInt = num;
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

        if(k>0){
            return myInt;
        }else{
            myInt = 0;
            return myInt;
        }
    }


}
