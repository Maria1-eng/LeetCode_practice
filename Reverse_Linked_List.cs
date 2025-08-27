/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode nCab = null;      
        ListNode actual = head;    

        while (actual != null) {
            ListNode siguiente = actual.next; 
            actual.next = nCab;               
            nCab = actual;                   
            actual = siguiente;               
        }

        return nCab; 
    }
}