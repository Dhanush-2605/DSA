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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        ListNode res=new ListNode();
        ListNode dummy=res;
        int carry=0;
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        while (!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int v1=(s1.isEmpty()?0:s1.pop());
            int v2=(s2.isEmpty()?0:s2.pop());
            int rem=(v1+v2+carry)%10;
            carry=(v1+v2+carry)/10;
            ListNode val=new ListNode(rem);
            dummy.next=val;
            dummy=dummy.next;
            
        }
        ListNode ans=reverseList(res.next);
        return ans;
    }
    ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        ListNode suc=null;
        while (cur!=null){
            suc=cur.next;
            cur.next=prev;
            prev=cur;
            cur=suc;
        }
        return prev;
    }
}