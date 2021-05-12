package com.company.day1;

import java.util.Scanner;

public class BooleanElection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bool1 = ");
        boolean myBool1 = scanner.nextBoolean();
        System.out.print("Bool2 = ");
        boolean myBool2 = scanner.nextBoolean();
        System.out.print("Bool3 = ");
        boolean myBool3 = scanner.nextBoolean();
        System.out.println(election(myBool1,myBool2,myBool3));
    }
    public static boolean election(boolean myBool1,boolean myBool2,boolean myBool3){
        if(myBool1 == true && (myBool2 == true || myBool3 == true) || (myBool2 == true && myBool3 == true ) ){
            return true;
        }else{
            return false;
        }
    }
}
