/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a==null || b==null)
        {
            return null;
        }
        ListNode A=a;
        ListNode B=b;
        int n=lengthOfNode(a);
        int m=lengthOfNode(b);
        int d=m-n;
        
        //checking the length of linked list
        if(n>m){
            ListNode temp=A;
            A=B;
            B=temp;
            d=n-m;
        }
        for(int i=0;i<d;i++)
        {
            B=B.next;
        }
        
        //Now Traverse to get both address same;
        
        //
        while(A!=null && B!=null)
       {
            if(A==B)
                return A;
                
            A=A.next;
            B=B.next;
        }
        
      return null;  
    }
    
    
    //function for returning length of the node;
    int lengthOfNode(ListNode a)
    {
        ListNode temp=a;
        int count=0;
        while(temp.next != null)
        {
            temp=temp.next;
            count++;
           
            
        }
        return count;
    }
}
