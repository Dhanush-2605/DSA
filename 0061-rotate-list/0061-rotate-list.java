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
        if (head==null) return null;
        ListNode cur=head;
        ListNode firstHalf=head;
        ListNode tempFirst=firstHalf;
        ListNode secondHalf;
        ListNode tempSecond;
        int len=0;
        while (cur!=null){            
            len++;
            cur=cur.next;
        }
        k=k%len;
        if (k==0  || len==1 || len==k) return head;

        int diff=len-k-1;
        for (int i=0;i<diff;i++){
            tempFirst=tempFirst.next;
            
        }
        secondHalf=tempFirst.next;
        tempFirst.next=null;
        tempSecond=secondHalf;
        ListNode prev=new ListNode();
        while (tempSecond!=null){
            prev=tempSecond;
            tempSecond=tempSecond.next;
        }
        prev.next=firstHalf;
        
        return secondHalf;
        
        
        
    }
}