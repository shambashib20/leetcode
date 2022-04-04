
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, second = head, first = head;
        for(int i=0; i<k-1; i++)    fast = fast.next;
        first = fast;
        while(fast.next != null){
            fast = fast.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
