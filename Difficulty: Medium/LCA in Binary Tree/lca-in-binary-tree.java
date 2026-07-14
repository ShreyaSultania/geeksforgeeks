/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root==null) return root;
        if(root.data==n1 || root.data==n2) return root;
        Node leftN=lca(root.left,n1,n2);
        Node rightN=lca(root.right,n1,n2);
        if(leftN!=null && rightN!=null) return root;
        else if(leftN!=null) return leftN;
        return rightN;
    }
}