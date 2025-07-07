/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public Node addOne(Node head) {
       
        // code here.
     Node dummy=new Node(0);
     Node ans=dummy;
      Node a= reverse(head);
      int carry=1;
      while(a!=null || carry>0){
      int sum=carry;
      if(a!=null) {sum+=a.data;
      a=a.next;
      }
      Node p=new Node(sum%10);
      
      ans.next=p;
      ans=ans.next;
      carry=sum/10;
        
    }
    Node rev=reverse(dummy.next);
    return rev;
    }
}