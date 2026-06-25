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
        ListNode curr=head;
        ListNode sh=head;
        ListNode prev=null;
        ListNode fh=head;
        int count=0, idx=0, max=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        while(idx!=count/2){
            sh=sh.next;
            idx++;
        }
        while(sh!=null){
            ListNode next=sh.next;
            sh.next=prev;
            prev=sh;
            sh=next;
        }

        while(prev!=null){
            max=Math.max(max,fh.val+prev.val);
            fh=fh.next;
            prev=prev.next;
        }
        return max;
    }
}