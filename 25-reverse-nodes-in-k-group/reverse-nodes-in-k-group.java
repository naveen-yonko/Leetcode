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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tmp = head;
        int size=0;
        int[] rev = new int[k];
        while(tmp != null){ 
            tmp = tmp.next;
            size++;
        }
        int times = size/k;
        tmp =head;
        ListNode strt = head;
        for(int i=0;i<times;i++){
            for(int j = 0;j<k;j++){
                rev[j]=tmp.val;
                tmp = tmp.next;
            }
            for(int j = k-1;j>=0;j--){
                strt.val = rev[j];
                strt = strt.next;
            }
        }
        return head;
    }
}