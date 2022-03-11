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
    public ListNode rotateRight(ListNode head, int k) {
        
        int length = getLength(head);
        if(head == null ||  k%length == 0)
            return head;
        k = k % length;
        int i=1;
        ListNode temp = head;
        while(i < length-k )
        {
            temp = temp.next;
            i++;
        }
        ListNode nextHead = temp.next;
        temp.next = null;
        temp = nextHead;
        while(temp.next != null)
            temp = temp.next;
        temp.next = head;
        return nextHead;
        
    }
    int getLength(ListNode head)
    {
        int length = 0;
        while(head != null)
        {
            head = head.next;
            length++;
        }
        return length;
    }
}