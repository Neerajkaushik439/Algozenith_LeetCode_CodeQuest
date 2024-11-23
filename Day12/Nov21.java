class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head; // No partitioning needed for empty or single-node list
        }

        // Initialize pointers
        ListNode dummy = new ListNode(-1); // Dummy node to simplify the head handling
        dummy.next = head;
        ListNode left = dummy; // Pointer to insert smaller nodes
        ListNode right = dummy;

        // Move 'right' to the first node >= x
        while (right.next != null && right.next.val < x) {
            right = right.next;
        }

        // 'left' starts at the dummy node
        left = right;

        // Rearrange nodes
        while (right != null && right.next != null) {
            if (right.next.val < x) {
                // Extract the node smaller than x
                ListNode temp = right.next;
                right.next = temp.next;

                // Insert the node after 'left'
                temp.next = left.next;
                left.next = temp;

                // Move 'left' forward
                left = left.next;
            } else {
                // Move 'right' forward
                right = right.next;
            }
        }

        return dummy.next;

    }
}
