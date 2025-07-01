/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
  static Node reverse(Node num){
        Node curr=num;
        Node prev=null;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
     while(num1.data==0){
         num1=num1.next;
     }
     while(num2.data==0){
         num2=num2.next;
     }
       Node l1= reverse(num1);
       Node l2= reverse(num2);
       Node dummy=new Node(0);
       Node temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null ||carry!=0){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.data;
                l2=l2.next;
            }
            sum=sum+carry;
            Node a=new Node(sum%10);
            carry=sum/10;
            temp.next=a;
            temp=a;
        }
        Node ans=reverse(dummy.next);
        return ans;
        
    }
}