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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode curr = list1;
        ListNode curr2 = list2;

        // Move curr to the node before index a
        for (int i = 0; i < a - 1; i++) {
            curr = curr.next;
        }

        ListNode afterB = curr;

        // Move afterB to the node after index b
        for (int i = 0; i < b - a + 2; i++) {
            afterB = afterB.next;
        }

        // Find last node of list2
        while (curr2.next != null) {
            curr2 = curr2.next;
        }

        // Connect
        curr.next = list2;
        curr2.next = afterB;

        return list1;
    }
}