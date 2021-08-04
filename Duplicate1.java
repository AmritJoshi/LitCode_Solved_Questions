/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3

Example 3:

Input: nums = [1,1]
Output: 1

Example 4:

Input: nums = [1,1,2]
Output: 1
*/
class Solution {
    public int findDuplicate(int[] nums) {
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            int id=Math.abs(nums[i]);
            
            if(nums[id]<0){
                ans=nums[i];
                break;
            }
            nums[id]=-nums[id];
            
            
        }
        return Math.abs(ans);
    }
}
 
