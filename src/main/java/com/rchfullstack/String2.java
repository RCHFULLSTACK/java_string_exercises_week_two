package com.rchfullstack;

public class String2 {
    public void exerTwo(){
        String str = "Long example sentence";

        if (str.length() > 6) {
            char charIndex6 = str.charAt(6);
            System.out.println("Character at index 6: " + charIndex6);
        } else {
            System.out.println("Ths string does not have an index 6.");
        }
    }
}
