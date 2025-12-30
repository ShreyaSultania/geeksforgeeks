// User function Template for Java

/* Structure of Doubly Linked List
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
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node dummy=new Node();
        dummy.data=0;
        Node temp=head;
        Node t=dummy;
        while(temp!=null){
            if(temp.data!=x){
               t.next=temp;
               temp.prev=t;
               t=t.next;
               
            }
            temp=temp.next;
            
        }
        t.next=null;
        if(dummy.next!=null){
            dummy.next.prev=null;
        }
        return dummy.next;
    }
}