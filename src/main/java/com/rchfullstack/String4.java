package com.rchfullstack;

public class String4 {
    public void exerFour(){
        String orginalString = "CAPS EQUALS SCREAMING";

        String lowercaseString = orginalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        String uppercaseString = lowercaseString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);
    }
}
