/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        int c=0;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=slow.next;
                c=1;
              while(slow!=fast){
                  slow=slow.next;
                    c++;
              }
              return c;
            }
        }
        return 0;
    }
}