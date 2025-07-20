/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
      int min=Integer.MAX_VALUE;
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
      
        if(root==null) return 0;
         
        if(root.left==null) return root.data;
       return minValue(root.left);
         
    }
}