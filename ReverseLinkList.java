public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode prev=null,current,next;
        ListNode temp,head=A;
        
        
        current=head;
        next=current.next;
        if(head.next==null)
            return head;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        return prev;
    }
}
