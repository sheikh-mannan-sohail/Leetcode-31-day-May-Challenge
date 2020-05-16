/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
     
        if(head == null)return head;
        else if(head.next==null)return head;
        else if(head.next.next == null)return  head;
        
        ListNode slow = head, slow_tail = head;
        ListNode fast = head.next, fast_tail = head.next;
        
        while(slow_tail!=null && fast_tail!=null && slow_tail.next!=null && fast_tail.next!=null){
            
                slow_tail.next = fast_tail.next;
                slow_tail = slow_tail.next;
            
                fast_tail.next = slow_tail.next;
                fast_tail = fast_tail.next;
            
        }
        if(slow_tail!=null)slow_tail.next = fast;
        
        return slow;
    }



}
