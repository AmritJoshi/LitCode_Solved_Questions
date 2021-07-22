/*
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column

Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li=new ArrayList<>();
      
        int n= matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int num=matrix[i][j];
                
                boolean rowmin=minval(matrix,i,num);
                boolean colmax=maxval(matrix,j,num);
                
                if(rowmin && colmax){
                    li.add(num);
                }
                
            }
        }
        return li;
    }
    
    static boolean minval(int[][] matrix,int i,int num){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=num && num>matrix[i][j]){
                return false;
            }
            
        }
        return true;
        
    }
    
    static boolean maxval(int[][] matrix,int j,int num){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=num && num < matrix[i][j]){
                return false;
            }
            
        }
        return true;
        
    }
}
