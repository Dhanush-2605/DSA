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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode();
        ListNode res=left;
        ListNode right=new ListNode();
        ListNode secondHalf=right;
        while(head!=null){
            ListNode cur=new ListNode(head.val);
            if (head.val<x){
                left.next=cur;
                left=left.next;
            }
            else{
                right.next=cur;
                right=right.next;
            }
            head=head.next;
        }
        left.next=secondHalf.next;
        return res.next;
        
    }
}