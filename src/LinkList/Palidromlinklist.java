package LinkList;

public class Palidromlinklist {
    public boolean isPalindrome(ListNode head) {
        boolean flag=false;
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow;
        ListNode prev=null;
        ListNode next1=slow;
        while (temp!=null){
            next1=next1.next;
            temp.next=prev;
            prev=temp;
            temp=next1;
        }
        while (prev!=null && head!=null){
            if(prev.val!=head.val) {
                return false;
            }
            prev=prev.next;
            head=head.next;
        }
            return true;
    }
}
