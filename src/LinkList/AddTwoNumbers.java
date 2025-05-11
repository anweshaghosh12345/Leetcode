package LinkList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode current=l3;
        int temp=0;
        int sum=0;
        int carry=0;
        while (l1!=null && l2!=null){
            sum=carry+l1.val+l2.val;
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            sum=carry+l1.val;
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry=sum/10;
            l1=l1.next;
        }
        while (l2!=null){
            sum=carry+l2.val;
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry=sum/10;
            l2=l2.next;
        }
        if(carry!=0){
            current.next = new ListNode(carry);
            current = current.next;
        }
        return l3.next;
    }
}
