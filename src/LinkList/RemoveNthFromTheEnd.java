package LinkList;

public class RemoveNthFromTheEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        int t=count-n;
        if(t==0 || count==0){
            ListNode newH=head.next;
            head=null;
            return newH;
        }
        temp =head;

        int t1=0;
       while (t!=t1 && temp!=null){
           temp = temp.next;
           t1++;
       }
       ListNode del= temp.next;
       temp.next= temp.next.next;
        del=null;
        return head;
    }
}
