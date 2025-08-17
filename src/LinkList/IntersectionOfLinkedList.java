package LinkList;

public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        ListNode t1=headA;
        ListNode t2=headB;
        while (t1!=null)
        {
            t1=t1.next;
            l1++;
        }
        while (t2!=null){
            t2=t2.next;
            l2++;
        }
        int diff=l1-l2;
        if(diff<0){
            while (diff<0) {
                headB=headB.next;
                diff++;
            }
        }
        else {
            while (diff>0){
                headA=headA.next;
                diff--;
            }
        }
        while (headA!=null && headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
