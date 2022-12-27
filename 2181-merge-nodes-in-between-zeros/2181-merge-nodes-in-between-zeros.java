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
    ArrayList<Integer> ans=new ArrayList<>();
    public ListNode mergeNodes(ListNode head) {
        ListNode res=new ListNode();
        ListNode temp=res;
        while (head!=null){
            temp=midSum(head);
            head=temp;
        }
        System.out.println(ans);
        res.val=-1;
        res=res.next;
        ListNode temp1=null;
        // temps=res;/
        ListNode temp2=temp1;
        for (int i=ans.size()-1;i>=0;i--){
            temp1=insert(temp1,ans.get(i));         
            
            
            // temp1=temp1.next;
        }
        return temp1.next;

        
    }
    ListNode midSum(ListNode head){
        ListNode temp=head;
        ListNode move=head;
        int sum=0;
        while (move.val!=0){
            sum+=move.val;
            move=move.next;
        }

        ans.add(sum);
        return move.next;
        
    }
    ListNode insert(ListNode head,int val){
       ListNode cur=new ListNode();
        cur.val=val;
        cur.next=head;
        head=cur;
        return head;
        
    }
}