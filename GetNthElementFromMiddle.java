/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        
        ListNode D=A;
        int l=lengthOfList(A);
        int n=((l/2)+1-B);
        if(n>=1)
        {
            n=n-1;
            while(n>0)
            {
                D=D.next;
                n=n-1;
                
            }
            return D.val;
        }
        else
        {
            return -1;
        }
    }
    
    
    //function for finding length of linked list node;
    int lengthOfList(ListNode C)
    {
        ListNode temp=C;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
