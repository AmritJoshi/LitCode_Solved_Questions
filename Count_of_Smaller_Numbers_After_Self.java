/*
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

 

Example 1:

Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:

Input: nums = [-1]
Output: [0]
Example 3:

Input: nums = [-1,-1]
Output: [0,0]


Soln :using mergeSort
*/

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        int[] count=new int[n];
        int[] originalindex=new int[n];
        for(int i=0;i<n;i++){
            originalindex[i]=i;
        }
        
        
        List<Integer> ans=new ArrayList<>();
        
        mergeSort(nums,originalindex,0,n-1,count);
        for(int i=0;i<n;i++){
            ans.add(count[i]);
        }
        
        return ans;
    }
    
    public void mergeSort(int[] nums,int[] originalindex,int left,int right,int[] count){
    
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(nums,originalindex,left,mid,count);
            mergeSort(nums,originalindex,mid+1,right,count);
            merge(nums,originalindex,left,mid,right,count);
        }
        
        
    }
    
    public void merge(int[] nums,int[] originalindex,int left,int mid,int right,int[] count){
        int[] temp=new int[right-left+1];
        int[] new_indexex=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        int idx=0;
        
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){
                count[originalindex[i]]+=(right-j+1);
                temp[k++]=nums[i];
                new_indexex[idx++]=originalindex[i];
                i++;
            }else{
                temp[k++]=nums[j];
                new_indexex[idx++]=originalindex[j];
                j++;
            }
        }
        
        while(j<=right){
            temp[k++]=nums[j];
            new_indexex[idx++]=originalindex[j];
            j++;
        }
        
        
        while(i<=mid){
            temp[k++]=nums[i];
            new_indexex[idx++]=originalindex[i];
            i++;
        }
        
        k=0;
        idx=0;
        
        for(int index=left ; index<=right;index++){
            nums[index]=temp[k++];
            originalindex[index]=new_indexex[idx++];
        }
        
    }
}
