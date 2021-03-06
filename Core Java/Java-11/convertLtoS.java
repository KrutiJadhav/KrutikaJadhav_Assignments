package com.cg.java11;

import java.util.ArrayList;
import java.util.Arrays;

public class convertLtoS {
    public static void main(String[] args) {
    	
        String str="A quick brown fox jumps over the lazy dog";
        
        ArrayList<String> strarr=new ArrayList<>();
        
        //this will divide the string recursivly when it encounters a space
        
        strarr.addAll(Arrays.asList(str.split(" ")));
        
        System.out.println(strarr);
        
//Returns an array containing all of the elements in this list in propersequence (from first to last element);
//the runtime type of the returnedarray is that of the specified array
        String[] array= strarr.toArray(new String[0]);
        
        Arrays.stream(array).forEach(t-> System.out.println(t));
    }
}