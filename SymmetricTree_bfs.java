/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Example 1:

Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:

Input: root = [1,2,2,null,3,null,3]
Output: false
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> que =new ArrayDeque<>();
        que.add(root);
        
        while(!que.isEmpty()){
        List<Integer> li= new ArrayList<>(que.size()*2);
            for(int k=que.size();k>0;k--){
                TreeNode node=que.poll();
                if(node.left!=null){
                    que.add(node.left);
                    li.add(node.left.val);
                }else{
                    li.add(null);
                }
                
                if(node.right!=null){
                    que.add(node.right);
                    li.add(node.right.val);
                }
                else{
                    li.add(null);
                }
            }
             if(!Symlevel(li)) return false;
        }
        return true;
    }
    private boolean Symlevel(List<Integer> li){
        if((li.size() & 1)==1) return false;
    
    int l=0, r=li.size()-1;
    
    while(l<r && li.get(l)==li.get(r)){
        l++;
        r--;
    }
    return l>=r;
}
}
