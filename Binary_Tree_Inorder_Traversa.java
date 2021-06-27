/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:

Input: root = []
Output: []

Example 3:

Input: root = [1]
Output: [1]
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
            
        Stack<TreeNode> st= new Stack<>();
        
        TreeNode cur=root;
        
        while(cur!=null || !st.isEmpty()){
            while(cur!=null){
                st.add(cur);
                cur=cur.left;
            }
            cur=st.pop();
            ans.add(cur.val);
            
            cur=cur.right;
        }
        return ans;
    }
}
