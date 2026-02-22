/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
     static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    static void helper(Node root,ArrayList<Integer>temp){
        if(root==null) return;
         temp.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(temp));
        }
        helper(root.left,temp);
        helper(root.right,temp);
        temp.remove(temp.size()-1);
     }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ans.clear();
        ArrayList<Integer>temp=new ArrayList<>();
        helper(root,temp);
        return ans;
    }
}