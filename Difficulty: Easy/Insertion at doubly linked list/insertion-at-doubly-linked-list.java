/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node temp=head;
        Node t=new Node(x);
        for(int i=0;i<p;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        if(temp.next!=null) temp.next.prev=t;
        temp.next=t;
        t.prev=temp;
        return head;
    }
}