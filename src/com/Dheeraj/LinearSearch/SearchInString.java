package com.Dheeraj.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Dheeraj";
        char target = 'r';
        System.out.println(Search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));

    }
    static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
