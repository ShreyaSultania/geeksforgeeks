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
//   void helper(Node root,int sum){
//       if(root==null) return;
//       sum=sum+root.data;
//       helper(root.left,sum);
//       helper(root.right,sum);
//   }
    static int sumBT(Node root) {
        // Your code here
    // int sum=0;
    // Solution().helper(root,sum);
    // return sum;
     if(root==null) return 0;
       
      return root.data+ sumBT(root.left)+ sumBT(root.right);
}
}