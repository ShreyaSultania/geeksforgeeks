/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    boolean helper(Node root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
            int a=0;
            int b=0;
            if(root.left!=null){
                a=root.left.data;
            }
            if(root.right!=null){
                b=root.right.data;
           }
           if(a+b!=root.data) return false;
        
        return helper(root.left) && helper(root.right);
    }
    public boolean isSumProperty(Node root) {
        //  code here
        return helper(root);
    }
}