package com.Dheeraj.binary;

public class FirstAndLast {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    int search(int[] nums, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                ans = mid;
                //potential ans
                if(findStart){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
