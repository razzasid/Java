package com.Company;

public class SwapTwoNumbers {
    public static void main(String[] args){
        float first = 1.43f , second = 4.78f;
        System.out.println("--Before Swap--");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

        float temp = first;

        first = second;

        second = temp;


        System.out.println("--After Swap--");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

    }
}
