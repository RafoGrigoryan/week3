package com.company.day1;

public class Minimum {
    public static void main(String[] args) {

        System.out.println( min(7,2,6,8));

    }
    public static int min(int a, int b, int c,int d){
        if(a < b && a<c && a<d){
            return a;
        }else if(b<a && b<c && b<d){
            return b;
        }else if(c<a && c<b && c<d){
            return c;
        }else{
            return d;
        }
    }
}
