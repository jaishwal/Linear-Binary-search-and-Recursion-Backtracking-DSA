package com.Dheeraj.binary;
//based on the concept of ceiling
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'I','K','M'};
        char target = 'K';
        System.out.println(letterSmall(letters,target));
    }
    public static char letterSmall(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }

}
