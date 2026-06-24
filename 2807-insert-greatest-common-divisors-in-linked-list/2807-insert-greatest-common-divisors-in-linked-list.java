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
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode f=head;
        while(f!=null&&f.next!=null){
            int g=gcd(f.val,f.next.val);
            ListNode node=new ListNode(g);
            node.next=f.next;
            f.next=node;
            f=node.next;
        }
        return head;
    }
}