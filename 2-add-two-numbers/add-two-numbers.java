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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1= l1;
        ListNode n2= l2;
        ListNode reshead = new ListNode();
        ListNode prev =reshead;
        int t1=0,t2=0,pcry=0,ncry=0,tres=0;
        while(n1 != null && n2 != null){
            ListNode res = new ListNode();
            t1 = n1.val;t2=n2.val;
            tres = (t1+t2+pcry)%10;
            ncry = (t1+t2+pcry)/10;
            pcry = ncry;
            res.val=tres;
            res.next = null;
            prev.next = res;
            prev = res;
            ncry=0;
            n1=n1.next;n2=n2.next;
        }
        while( n1 != null){
            ListNode res = new ListNode();
            t1 = n1.val;
             tres = (t1+pcry)%10;
            ncry = (t1+pcry)/10;
            pcry = ncry;
            res.val=tres;
            res.next = null;
            prev.next = res;
            prev = res;
            ncry=0;
            n1=n1.next;
        }
        while( n2 != null){
            ListNode res = new ListNode();
            t1 = n2.val;
             tres = (t1+pcry)%10;
            ncry = (t1+pcry)/10;
            pcry = ncry;
            res.val=tres;
            res.next = null;
            prev.next = res;
            prev = res;
            ncry=0;
            n2=n2.next;
        }
        if(pcry == 1 ){
            ListNode res = new ListNode();
            res.val=1;
            res.next = null;
            prev.next = res;
            prev = res;
        }
        return reshead.next;
    }
}