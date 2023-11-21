package com.rchfullstack;

public class String3 {
    public void exerThree(){
        String originalString = "Ok this is not as long!";
        int exclamationIndex = originalString.indexOf("!");
        String resultSubstring = originalString.substring(originalString.indexOf("not"), exclamationIndex);
        System.out.println(resultSubstring);
    }
}
