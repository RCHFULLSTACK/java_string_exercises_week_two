package com.rchfullstack;

public class String9 {
    public void exerNine(){
        String nameString = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = nameString.split(",");
        System.out.println("Names Array:");
        for(String name : namesArray){
            System.out.println(name);
        }
    }
}
