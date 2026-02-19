/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    void leftTraverse(ArrayList<Integer>ans,Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null)leftTraverse(ans,root.left);
        else{
            leftTraverse(ans,root.right);
        }
    }
    void leafTraverse(ArrayList<Integer>ans,Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            ans.add(root.data);
            return;
        }
        leafTraverse(ans,root.left);
        leafTraverse(ans,root.right);
    }
    void rightTraverse(ArrayList<Integer>ans,Node root){
            if(root==null) return;
            if(root.left==null && root.right==null) return;
            if(root.right!=null)rightTraverse(ans,root.right);
            else{
                rightTraverse(ans,root.left);
            }
            ans.add(root.data);
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        if(root.left==null && root.right==null){
        ans.add(root.data);
        return ans;
}
        ans.add(root.data);
        leftTraverse(ans,root.left);
        leafTraverse(ans,root);
        rightTraverse(ans,root.right);
        return ans;
    }
}