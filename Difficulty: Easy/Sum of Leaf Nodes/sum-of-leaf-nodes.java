/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int helper(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return helper(root.left)+helper(root.right);
        
    }
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        // Your code here
       
        return new Solution().helper(root);
    
    }
}