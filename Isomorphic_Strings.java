/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

Example 3:

Input: s = "paper", t = "title"
Output: true

 

Constraints:

    1 <= s.length <= 5 * 104
    t.length == s.length
    s and t consist of any valid ascii character.
Solution:
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null || s.length() !=t.length())
            return false;
        
        int[] s1=new int[256];
        int[] s2=new int[256];
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            
            if(s1[c1]!=s2[c2]){
                return false;
            }
            s1[c1]=i+1;
            s2[c2]=i+1;
        }
        return true;
    }
}
