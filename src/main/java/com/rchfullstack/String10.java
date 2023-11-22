package com.rchfullstack;

public class String10 {
    public void exerTen(){
        String orginalString = "ThisShouldBeConverted";
        char[] charArray = orginalString.toCharArray();

        System.out.println("Characters Array:");
        for (char ch : charArray){
            System.out.println(ch);
        }
    }
}
