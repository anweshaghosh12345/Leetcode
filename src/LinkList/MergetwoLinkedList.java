package LinkList;

public class MergetwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        while (list1!=null && list2!=null)
        {
            if(list1.val<list2.val){
                head=list1;
                head=head.next;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                head=list2;
                head=head.next;
                list2=list2.next;
            }
            else {
                head=list1;
                head=head.next;
                list1= list1.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            head=list2;
        } else if (list2==null) {
            head=list1;
        }
        return head;
    }
}
