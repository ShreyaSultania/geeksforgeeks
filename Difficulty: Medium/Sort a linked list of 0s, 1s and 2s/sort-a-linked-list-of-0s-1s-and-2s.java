/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node temp=head;
        ArrayList<Integer>ans=new ArrayList<>();
        while(temp!=null){
            ans.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(ans);
        Node dummy=new Node(0);
        Node t=dummy;
        for(int i=0;i<ans.size();i++){
            Node a=new Node(ans.get(i));
            t.next=a;
            t=t.next;
            
        }
        return dummy.next;
    }
}