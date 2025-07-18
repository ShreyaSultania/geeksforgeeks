
class Solution {
 
    public int isSumProperty(Node root) {
        if(root==null || (root.left==null && root.right==null)) return 1;
      int left=root.left==null?0:root.left.data;
      int right=root.right==null?0:root.right.data;
      if(root.data!=left+right){
          return 0;
      }
      
        int l=isSumProperty(root.left);
         int r=isSumProperty(root.right);
         if(l==1 && r==1) return 1;
         else return 0;
           
    }
}