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
        int len=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        if (len==1) return null;
        if (len==n) return head.next;
        int diff=len-n;
        ListNode cur=head;
        for (int i=0;i<diff-1;i++){
            cur=cur.next;
        }
         cur.next=cur.next.next;
        return head;
        
    }
}