/*
Problem statement:
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.

Solution:
*/
class Solution {
public:
    string addBinary(string a, string b) {
       int s=a.length()-1;
        int s1=b.length()-1;
        string str="";
        int c=0;
        while(s>=0||s1>=0||c==1){
            c+=(s>=0)?a[s]-'0':0;
            c+=(s1>=0)?b[s1]-'0':0;
            char ch=c%2+'0';
            str=ch+str;
            s--;
            s1--;
            c=c/2;
        }
        return str;
    }
};
