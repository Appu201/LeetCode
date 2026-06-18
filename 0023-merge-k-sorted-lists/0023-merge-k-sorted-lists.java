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
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null||lists.length==0) return null;

        ListNode ans=null;

        for(int i=0;i<lists.length;i++){
            ans=merge(ans,lists[i]);
        }

        return ans;
    }

    public ListNode merge(ListNode fh,ListNode sh){
        if(fh==null) return sh;
        if(sh==null) return fh;

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(fh!=null&&sh!=null){
            if(fh.val<=sh.val){
                temp.next=fh;
                fh=fh.next;
            }else{
                temp.next=sh;
                sh=sh.next;
            }
            temp=temp.next;
        }

        if(fh!=null) temp.next=fh;
        if(sh!=null) temp.next=sh;

        return dummy.next;
    }
}