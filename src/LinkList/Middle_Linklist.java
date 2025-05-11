package LinkList;

public class Middle_Linklist {
    public ListNode middleNode(ListNode head) {

        int i=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            i++;
        }
        int mid=i/2;
        int k=0;
        while (k!=mid){
            head=head.next;
            k++;
        }
        ListNode slow=head, fast=head;
        while (fast!=null && fast.next!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            head=slow;
        }
        return head;
    }
}
