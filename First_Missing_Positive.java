/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3

Example 2:

Input: nums = [3,4,-1,1]
Output: 2

Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;

            for(int i=0;i<n;i++){
                if(nums[i]<=0 || nums[i]>n){
                    nums[i]=n+1;
                    
                }
                
            }
        
        for(int i=0;i<n;i++){
            int id=Math.abs(nums[i]);
            
            if(id>n) continue;
            id--;
            
            if(nums[id]>0) nums[id]=-nums[id];
            
        }
        //int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
