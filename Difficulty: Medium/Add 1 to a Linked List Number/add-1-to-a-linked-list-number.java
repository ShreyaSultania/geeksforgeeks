/* Structure of linked list Node
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
        Node dummy=new Node(-1);
        // code here.
        Node t=dummy;
        Node temp=reverse(head);
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            temp=temp.next;
            t.next=new Node(sum%10);
            t=t.next;
            carry=sum/10;
        }
        if(carry>0){
            t.next=new Node(carry%10);
            t=t.next;
        }
        return reverse(dummy.next);
    }
}