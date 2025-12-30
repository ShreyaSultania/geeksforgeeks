/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        Node i=head;
        Node temp=head;
        Node j=temp.next;
        while(j!=null){
            if(temp.data==j.data){
                j=j.next;
            }
            else{
                temp.next=j;
                j.prev=temp;
                temp=j;
                j=j.next;
            }
        }
        temp.next=null;
        return head;
    }
}