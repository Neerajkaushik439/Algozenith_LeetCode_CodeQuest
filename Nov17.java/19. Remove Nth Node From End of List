class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find length
        //position of node from start
        //delete that node
        ListNode temp=head;
        int  count=0;
        while(temp!=null){
            temp=temp.next;
            count++;

        }
        int m=count-n+1;
        

        if (head == null || m < 1) {
            return head; // Edge case: empty list or invalid position
        }

        if (m == 1) {
            return head.next; // Remove the head node
        }

        ListNode current = head;
        for (int i = 1; i < m - 1; i++) {
            if (current.next == null) {
                return head; // If m is greater than the list length, return the unchanged list
            }
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Skip the m-th node
        }
        return head;
    }
       
    }
