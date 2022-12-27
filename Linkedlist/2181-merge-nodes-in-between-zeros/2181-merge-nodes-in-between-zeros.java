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
    // ArrayList<Integer> ans=new ArrayList<>();
    public ListNode mergeNodes(ListNode head) {
 
        ListNode fast=head.next;
        ListNode slow=head;
        ListNode temp=slow;
        ListNode temp2=slow;
        int sum=0;
        while (fast!=null){
            if (fast.val==0){
                slow.val=sum;
                slow.next=fast;
                temp2=slow;
                slow=slow.next;
                sum=0;
            }
            sum+=fast.val;
            fast=fast.next;
        }
        temp2.next=null;
        return temp;

        
    }

}