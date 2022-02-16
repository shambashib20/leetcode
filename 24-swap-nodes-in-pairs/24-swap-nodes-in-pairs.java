/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
public ListNode swapPairs(ListNode head) {

  if(head==null)
      return head;
    ListNode a = head;
    int si =1;
    
    while(a.next!=null)
    {
        a=a.next;
        si++;
    }
    
    if(si==1)
        return head;
    
    a=head;
  
    if(si%2==0)
    {
        while(a!=null)
        {
            int t = a.val;
            a.val = a.next.val;
            a.next.val = t;
            a=a.next.next;
        }
    }
    
   if(si%2==1){
        while(a.next!=null )
        {
            int t = a.val;
            a.val = a.next.val;
            a.next.val = t;
            a=a.next.next;
        }
    }
    
    
    return head;
    
    
    
    
}
}