package com.Company;

public class Frequency {
    public static void main(String[] args){
        String str = "My Name is Raza.";
        char ch = 'a';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++){
            if (ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("frequency of " + ch + " = " + frequency);
    }
}
