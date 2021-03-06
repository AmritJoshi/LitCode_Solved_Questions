/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 

Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters.

*/
class Solution {
    
    public int minimumlength(String[] strs){
            int minn=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minn=Math.min(minn,strs[i].length());
        }
        return minn;
        
    }
    public String longestCommonPrefix(String[] strs) {
        int count=0;
        char current;
        String res="";
        int n=minimumlength(strs);
        for(int i=0;i<n;i++){
            current=strs[0].charAt(i);
            
            for(int j=1;j<strs.length;j++){
                if(current!=strs[j].charAt(i)){
                    return res;
                }
            }
            
            res+=current;
        }
        
        return res;
    }
}
