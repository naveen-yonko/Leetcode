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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = lists.length;
        for(int i=0;i<n;i++){
            while(lists[i] != null){
                pq.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        ListNode res = new ListNode(-1); 
        ListNode cur = res;
        //System.out.println(pq.size());
        while(!pq.isEmpty()){
            int x = pq.poll();
            ListNode tmp = new ListNode();
            tmp.val = x;
            cur.next = tmp;
            cur = tmp;
        }
        return res.next;
    }
}