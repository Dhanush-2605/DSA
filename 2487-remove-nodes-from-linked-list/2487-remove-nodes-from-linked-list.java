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
    public ListNode removeNodes(ListNode head) {
//  		Stack<Integer> s=new Stack<>();
// 		// int[] arr={5,2,13,3,7};
//         ArrayList<Integer> arr=new ArrayList<>();
//         ListNode curNode=head;
//         while (head!=null){
//             arr.add(head.val);
//             head=head.next;
//         }
//     		ArrayList<Integer> copy=new ArrayList<>();

// 		int ind=arr.size()-1;
// 		s.add(arr.get(ind));
// 		for (int i=ind-1;i>=0;i--){
// 		    if (s.peek()<arr.get(i)) s.add(arr.get(i));
// 		    // else copy.add(s.peek());
		    
// 		}
// 		ListNode cur=new ListNode();
//         ListNode res=cur;
//         if (s.size()==1) return curNode;
//         		System.out.println(s);

        
//         // for (int i=0;i<)
// 		while (s.size()!=0){
// 		    // if (copy.get(i)=={
// 		// System.out.println(copy.get(i));
// 		        cur.val=s.pop();
// 		        cur=cur.next;
//             System.out.println(s.size());
// 		    // }
// 		}
// 		System.out.println(arr);
// 		System.out.println(s);
//         // curNode.next=null;
// 		return res;
               Stack<ListNode>st=new Stack<>();
        if(head==null || head.next==null)return head;
        ListNode temp=new ListNode(Integer.MAX_VALUE),i=head;
        st.push(temp);
        while(i!=null){
            while(st.peek().val<i.val)st.pop();
            st.peek().next=i;
            st.push(i);
            i=i.next;
        }
        return temp.next;
        
    }
}