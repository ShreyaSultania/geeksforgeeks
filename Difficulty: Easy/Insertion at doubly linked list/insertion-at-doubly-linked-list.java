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
        Node val=new Node(x);
        Node temp=head;
        int c=0;
        while(temp!=null && c<p){
            c++;
            temp=temp.next;
        }
        if(temp!=null){
           val.next=temp.next;
           temp.next=val;
           val.prev=temp;
           if(temp.next!=null){
            temp.next=val;
            val.prev=temp;
        }
        temp=temp.next;
        
        }
        return head;
        
    }
}