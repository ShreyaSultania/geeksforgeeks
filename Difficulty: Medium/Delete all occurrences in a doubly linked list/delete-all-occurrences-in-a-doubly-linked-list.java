/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node dummy=new Node(-1);
        Node t=dummy;
        Node temp=head;
        while(temp!=null){
            if(temp.data!=x){
                t.next=temp;
                temp.prev=t;
                t=t.next;
            }
            temp=temp.next;
        }
        t.next=null;
        return dummy.next;
    }
}