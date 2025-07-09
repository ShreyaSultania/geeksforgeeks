/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
  static void helper(Node root,int max[]){
        if(root==null) return;
        if(root.data>max[0]) max[0]=root.data;
        helper(root.left,max);
        helper(root.right,max);
    }
  static void helper1(Node root,int mn[]){
        if(root==null) return;
        if(root.data<mn[0]) mn[0]=root.data;
        helper1(root.left,mn);
        helper1(root.right,mn);
    }
    public static int findMax(Node root) {
      int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
      helper(root,max);
    //   System.out.print(max[0]);
      return max[0];
        
    }

    public static int findMin(Node root) {
        int mn[]=new int[1];
        mn[0]=Integer.MAX_VALUE;
      helper1(root,mn);
        // System.out.print(min[0]);
      return mn[0];
       
    }
}
/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
// class Solution {
//     static void helper1(Node root,int arr[]){
//         if(root==null) return;
//         // arr[0]=Math.max(root.data,arr[0]);
//         if(root.data>arr[0]) arr[0]=root.data;
//         helper1(root.left,arr);
//         helper1(root.right,arr);
//     }
//     static void helper2(Node root,int arr[]){
//         if(root==null) return;
//         // arr[0]=Math.min(root.data,arr[0]);
//         if(root.data<arr[0]) arr[0]=root.data;
//         helper2(root.left,arr);
//         helper2(root.right,arr);
//     }
//     public static int findMax(Node root) {
//         // code here
//         int arr[]=new int[1];
//         helper1(root,arr);
//         return arr[0];
       
//     }

//     public static int findMin(Node root) {
       
//         // code here
//         int arr[]=new int[1];
//         arr[0]=Integer.MAX_VALUE;
//         helper2(root,arr);
//         return arr[0];
//     }
// }