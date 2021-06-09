/* Problem Statement:

  Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
  
  Example 1:
  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: [4,-1,2,1] has the largest sum = 6.
  
  Example 2:
  Input: nums = [1]
  Output: 1
  
  Solution: */

import java.util.*;
class maxsubarray{

        public static void main(String args[]){
           int nums[]={-2,1,-3,4,-1,2,1,-5,4};
           int mx=0,mg=Integer.MIN_VALUE;
           for(int i=0;i<9;i++){
               mx=mx+nums[i];
               if(mx<nums[i]){
                   mx=nums[i];
               }
               if(mx>mg){
                    mg=mx;
               }
           }
         System.out.println(mg);
        }
}
