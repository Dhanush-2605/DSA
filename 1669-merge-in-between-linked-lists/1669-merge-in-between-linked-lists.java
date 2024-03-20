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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode res=list1;
        ListNode prev=null;
        ListNode temp=list1;
        ListNode temp2=list1;
        int ind=0;
        while (temp!=null){
            if (ind==a) break;
                    prev=temp;

            temp=temp.next;
            ind++;

        }
        ind=0;
        while(temp2!=null){
            if (ind==b) break;
            temp2=temp2.next;
                        ind++;

        }
        ListNode temp3=list2;
        while (temp3.next!=null){
            temp3=temp3.next;
        }
        prev.next=list2;
        temp3.next=temp2.next;
        
        return res;
        
        
        
    }
}