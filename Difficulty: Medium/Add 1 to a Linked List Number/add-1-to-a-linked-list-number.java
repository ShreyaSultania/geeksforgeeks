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
    public Node Reverse(Node head){
         Node prev=null;
        Node curr=head;
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
        Node temp=Reverse(head);
        Node dummy=new Node(0);
        Node t=dummy;
        int carry=1;
        while(temp!=null){
            Node a=new Node((temp.data+carry)%10);
            t.next=a;
            t=t.next;
            carry=(temp.data+carry)/10;
            temp=temp.next;
        }
        if(carry>0) {
        Node a=new Node((carry)%10);
            t.next=a;
            t=t.next;
        }
        return Reverse(dummy.next);
    }
}