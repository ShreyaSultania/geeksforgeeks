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
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node val=new Node(x);
        if(head==null) return val;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=val;
        return head;
    }
}