/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:

Input: nums = [1]
Output: [[1]]

 

Constraints:

    1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    All the integers of nums are unique.

*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        permutat(nums,0,nums.length-1,li);
        return li;
    }
    
    static void permutat(int[] nums,int l,int r,List<List<Integer>> li){
        if(l==r){
            li.add(toList(nums));
            return;
        }
        for(int j=l;j<=r;j++){
            swap(nums,j,l);
            permutat(nums,l+1,r,li);
           swap(nums,j,l);
            
        }
    }
    public static List<Integer> toList(int[] nums){
        List<Integer> l=new ArrayList<>();
        
        for(int i:nums){
            l.add(i);
        }
        return l;
    }
    
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
        
        
    }
}
