package com.Dheeraj.binary;

public class countRBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        int pivot = findPivot(arr);
        return pivot;
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            // 4 cases over here
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>end && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
