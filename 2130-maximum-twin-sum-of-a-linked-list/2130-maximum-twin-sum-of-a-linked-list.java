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
    public int pairSum(ListNode head) {
        Stack<Integer> st=new Stack<>();
        
        
     ListNode head1=head;
     ListNode temp=head;
     ListNode temp1=head;

        while (temp!=null){
            st.add(temp.val);
            temp=temp.next;
     }
        int res=-1;
    while (!st.isEmpty()){
        int first=temp1.val;
        int last=st.pop();
        res=Math.max(res,first+last);
        temp1=temp1.next;
        
    }
        return res;
        

        
    }
}