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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int middleIndex = size / 2;
        // if(size % 2 == 0){
        //     middleIndex += 1;
        // }
        temp = head;
        for(int i = 0; i < middleIndex; i++){
            temp = temp.next;
        }

        return temp;
    }
}