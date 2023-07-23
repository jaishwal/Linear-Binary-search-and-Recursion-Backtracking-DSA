package com.Dheeraj.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,6,1};
        int target = 3;
        System.out.println(LinearSearch1(arr,target));

    }
    static int LinearSearch1(int[] arr, int target){
        // base condition
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target){
                return index;

            }
        }
        //hence the target is not found
        return -1;
    }

}

