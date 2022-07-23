class Solution {
    public Node pairwiseSwap(Node head)
    {
        Node dummy= new Node(-1), prev= dummy, current= head;
        dummy.next = head;
            while (current != null && current.next != null) {
                prev.next = current.next;
                current.next = current.next.next;
                prev.next.next = current;
                current = current.next;
                prev = prev.next.next;
            }

            return dummy.next;
    }
}
