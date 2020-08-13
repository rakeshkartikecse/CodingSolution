/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        
        ListNode M=A;
        ListNode N=A;
        if(A==null)
            return null;
            
            
        for(int i=0;i<B;i++)
        {
            M=M.next;
            if(M==null)
                break;
        }
        if(M==null)
        {
            A=A.next;
            return A;
        }
        while(M.next!=null)
        {
            M=M.next;
            N=N.next;
        }
        
        N.next=N.next.next;
        
        return A ;
        
    }
    
    
    
}
