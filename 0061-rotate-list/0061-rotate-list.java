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
    public ListNode rotateRight(ListNode head,int k){
        if(head==null||head.next==null) return head;

        ListNode temp=head;
        int len=1;

        while(temp.next!=null){
            temp=temp.next;
            len++;
        }

        k = k%len;
        if(k==0) return head;

        int split=len-k;

        ListNode fh=head;
        for(int i=1; i<split; i++){
            fh=fh.next;
        }

        ListNode sh=fh.next;

        fh.next=null;
        temp.next=head;

        return sh;
    }
}