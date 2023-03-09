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
       int len=0;
        ListNode curNode=head;
        ListNode traverseNode=new ListNode(0);
        traverseNode.next=head;
        ListNode ans=traverseNode;
        while (curNode!=null){
            len++;
            curNode=curNode.next;
        }
        if (len==0 || len==1) return head;
        int totRot=k%len;
        if (totRot==0) return head;


        int remCount=len-totRot;
        while (remCount!=0){
            traverseNode=traverseNode.next;
            remCount--;
        }
        ListNode secondHalf=traverseNode.next;
        traverseNode.next=null;
        ListNode curSec=secondHalf;
        while (curSec!=null && curSec.next!=null){
            curSec=curSec.next;
        }
        curSec.next=ans.next;
        return secondHalf;
        
    }
}