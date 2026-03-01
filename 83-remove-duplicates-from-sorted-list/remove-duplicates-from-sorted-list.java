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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode dummy = new ListNode(Integer.MAX_VALUE,head);
        ListNode i=dummy,j=dummy.next;
        while(i != null && j!= null){
            if(i.val == j.val){
                j=j.next;
                //System.out.println(j+" "+j.val);
            }else{
                i.next=j;
                i=i.next;j=j.next;
                //System.out.println(i+" "+i.val+" "+" "+j);
            }
            i.next=null;
        }
        return dummy.next;
    }
}