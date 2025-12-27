class Solution {
    public Node delPos(Node head, int x) {

        if (head == null) return null;

        // Case 1: delete first node
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node temp = head;
        int c = 1;

        // Move to x-th node
        while (temp != null && c < x) {
            temp = temp.next;
            c++;
        }

        // If position is valid
        if (temp != null) {
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }

        return head;
    }
}
