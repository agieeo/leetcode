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
//普通数组双指针解法
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        ListNode cur = head;
        int val[] =new int[count];

        for(int i = 0; i < count; i++){
            val[i] = cur.val;
            cur = cur.next;
        }
        int front = 0;
        int back = count-1;
        while(front < back){
            if(val[front] != val[back]){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}