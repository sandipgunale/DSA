1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0, head);
14        ListNode first = dummy, second = dummy;
15        for (int i = 0; i <= n; i++) first = first.next;
16        while (first != null) {
17            first = first.next;
18            second = second.next;
19        }
20        second.next = second.next.next;
21        return dummy.next;
22    }
23}