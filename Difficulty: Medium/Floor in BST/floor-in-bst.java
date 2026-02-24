/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static int floor(Node root, int x) {
        // code here
        int ans=-1;
        if(root==null) return -1;
        if(root.data==x) return root.data;
        if(root.data>x){
           return floor(root.left,x);
        }
        else{
            int val=floor(root.right,x);
            if(val==-1) return root.data;
           return val;
        }
    }
}