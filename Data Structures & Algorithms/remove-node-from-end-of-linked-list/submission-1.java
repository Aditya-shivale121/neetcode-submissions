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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

        int count = 0;
        ListNode dummy = new ListNode(0 , head);
        ListNode curr = dummy;

        int size = 0;
        ListNode length = head;
        while(length != null){
            size++;
            length = length.next;
        }

         for(int i = 0 ; i < size - n ; i++){
            curr = curr.next;
         }
        
          curr.next = curr.next.next;
        
        
        
        return dummy.next;

    }
}
