package com.Dheeraj.binary;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,1,4};
        System.out.println(PeakInMountain(arr));
    }
    static int PeakInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
