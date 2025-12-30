/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        Node i=head;
        Node j=head;
        while(j.next!=null){
            j=j.next;
        }
        while(i!=null && j!=null && i!=j && j.next!=i ){
            int sum=i.data+j.data;
            if(sum==target){
                ArrayList<Integer>arr=new ArrayList<>();
                arr.add(i.data);
                arr.add(j.data);
                ans.add(arr);
                i=i.next;
                j=j.prev;
            }
            else if(sum<target){
                i=i.next;
            }
            else{
                j=j.prev;
            }
        }
        return ans;
        
       
    }
}
