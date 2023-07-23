package com.Dheeraj.binary;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,0,2,3};
        System.out.println(search(arr,7));

    }
    static int search(int[] arr, int target){
        int peak = PeakInMountain(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    public static int PeakInMountain(int[] arr){
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
    static int orderAgnostic(int[] arr, int target,int start,int end){
        // find whether the array is sorted in ascending or des
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            //find the middle element
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
