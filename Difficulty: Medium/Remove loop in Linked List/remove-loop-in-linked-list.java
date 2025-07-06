/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        Node temp=head;
        Node prev=null;
        boolean bool=false;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                bool=true;
                while(slow!=temp){
                    temp=temp.next;
                    prev=slow;
                    slow=slow.next;
                }break;
            }
        }
        if(bool) prev.next=null;
        
    }
}