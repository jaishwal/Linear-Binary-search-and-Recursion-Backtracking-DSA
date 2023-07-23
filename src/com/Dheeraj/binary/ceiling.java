package com.Dheeraj.binary;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22};
        int target = 4;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return end;

    }
}
