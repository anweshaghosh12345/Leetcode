package LinkList;

public class RemoveNthFromTheEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        if(head.next==null)
            return null;
        ListNode temp=head;
        int i=0;
        while (temp!=null){
            temp=temp.next;
            i++;
        }
        if(i==n){
            return head.next;
        }
        int k=i-n;
        temp=head;
        while (temp!=null){
            k--;
            if(k==0)
                break;
            temp=temp.next;

        }
        temp.next=temp.next.next;
        return head;
    }
}