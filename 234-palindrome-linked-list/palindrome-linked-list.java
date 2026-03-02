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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){return true;}
        ListNode fst=head,slo=head;
        ListNode prec = null;
        while(fst!=null && fst.next!=null){
            slo = slo.next;
            fst = fst.next.next;
        }
        while(fst != null){  //if(fst  != null){slo = slo.nxt}
            slo = slo.next;
            fst=fst.next;
        }
        ListNode prev = null;
        ListNode cur = slo;
        while( cur != null ){
            fst = cur.next ;
            cur.next = prev;
            prev = cur;
            cur=fst;
        }
        while(prev != null){
            //System.out.println(head.val +"  "+ prev.val);
            if(head.val != prev.val){
                return false;
            }
            else{
                head = head.next;
                prev = prev.next; 
            }
        }
        return true;
    }
}