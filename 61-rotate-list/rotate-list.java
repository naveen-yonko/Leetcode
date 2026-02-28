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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){return null;}
        ListNode tmp =head;
        int cnt=0;
        while(tmp.next!=null){
            cnt++;
            tmp=tmp.next;
        }
        cnt++;
        if(cnt <2){return head;}
        //System.out.println(cnt);
        int rot = k%cnt; 
        //System.out.println(rot);
        //int x=0;
        ListNode tmp1=head;
        for(int i=1;i<cnt-rot;i++){
            tmp1=tmp1.next;
        }
        tmp.next=head;
        head = tmp1.next;
        tmp1.next=null;

       //System.out.println(x+" "+tmp.val);
        return head;
    }
}