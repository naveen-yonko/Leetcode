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
         ListNode fst=head,slo=head;
         int cnt=0;
        while(fst!=null && fst.next!=null){
            slo = slo.next;
            fst = fst.next.next;
            cnt++;
        }
        //System.out.println(slo.val+ " "+cnt);
        ListNode cur = slo;
        ListNode prev = null;
        ListNode nxt = null;
        while(cur != null){
            nxt = cur.next;
            cur.next= prev;
            prev = cur;
            cur = nxt;
        }
        int max= Integer.MIN_VALUE;
        for(int i = 0;i<cnt;i++){
            max = Math.max(head.val+prev.val,max);
            head=head.next;prev = prev.next;
        }
        
        return max;
    }
}