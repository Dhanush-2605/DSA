class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
       
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while (temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int len=arr.size();
        boolean[] vis=new boolean[len];
        
        
        for (int i=0;i<len;i++){
            int sum=arr.get(i);
            if (arr.get(i)==0) vis[i]=true;
            for (int j=i+1;j<len;j++){
                sum+=arr.get(j);
                if (sum==0 && vis[i]==false){
                    for (int k=i;k<=j;k++) vis[k]=true;
                    break;
                }
                
            }
        }
      
        ListNode res=new ListNode(0);
        ListNode cur=res;
        for (int i=0;i<len;i++){
            if (vis[i]==false){
            ListNode temp1=new ListNode(arr.get(i));
            cur.next=temp1;
            cur=cur.next;
            }
            

        }
        ListNode Nu=null;
        if (len==1 && arr.get(0)==0) return Nu;
        return res.next;
       
    }
}