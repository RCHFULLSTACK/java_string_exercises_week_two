package com.rchfullstack;

public class String8 {
    public void exerEight(){
        String orginalString = "Oil and Water";
        String[] wordsArray = orginalString.split(" and | ");

        System.out.println("Words Array: ");
        for (String word : wordsArray){
            System.out.println(word);
        }
    }
}
