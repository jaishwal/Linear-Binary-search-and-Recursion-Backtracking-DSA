package com.Dheeraj.binary;
// split array sum
public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }
    static int splitArray(int[] nums, int n){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            //in the end of the loop this will contain the max item of the array
            end += nums[i];
            //Binary search
            while (start<end){
                int mid = start+(end-start)/2;
                //calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces = 1;
                for(int num : nums){
                    if(sum+num>mid){
                        //you cannot add this in this subarray, break new one
                        // say add this number in new subarray then sum = num
                        sum = num;
                        pieces++;
                    }else{
                        sum += num;
                    }
                }
                if(pieces>n){
                    start = mid+1;
                }else{
                    end = mid;
                }
            }
        }
        return end;
    }
}
