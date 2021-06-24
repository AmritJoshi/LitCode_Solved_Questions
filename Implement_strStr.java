/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:

Input: haystack = "", needle = ""
*/
//Use naive method for string matching
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        int n=haystack.length();
        int m=needle.length();
        
        if(n<m)
            return -1;
        
        for(int i=0;i<=(n-m);i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==m)
                return i;
        }
        return -1;
    }
}
