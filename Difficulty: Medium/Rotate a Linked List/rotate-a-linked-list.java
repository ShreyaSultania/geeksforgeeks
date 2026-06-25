/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev=null;
        Node Next=null;
        Node curr=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null) return head;
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0) return head;
        temp=reverse(head);
        Node t=temp;
        for(int i=1;i<size-k;i++){
            t=t.next;
        }
        Node s=t.next;
        t.next=null;
        Node a=reverse(s);
        Node b=reverse(temp);
        Node ans=b;
        while(ans.next!=null){
            ans=ans.next;
        }
        ans.next=a;
        return b;
    }
}