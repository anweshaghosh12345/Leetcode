package LinkList;

public class DetechCycle {
    public boolean hasCycle(ListNode head) {
        boolean f=false;
        ListNode fast=head;
        ListNode slow=head;

        while ( fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }

        return false;
    }
}
