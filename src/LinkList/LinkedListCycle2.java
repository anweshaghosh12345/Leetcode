package LinkList;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return head;
    }
}
