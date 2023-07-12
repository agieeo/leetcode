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
        int carry = 0; //先设初始进位为0
        int sum=0;
        ListNode head = null;
        ListNode tail = null;
        while(l1 != null || l2 != null){
            int x1=l1!=null?l1.val:0;//都是非空链表，但有节点的值可能是空的（没有值）
            int x2=l2!=null?l2.val:0;
            sum = x1 + x2 + carry;
            if(head == null){
                head = tail = new ListNode(sum%10);//当目标链表没有节点时，让head，tail都指向新节点
            } else {
                tail.next = new ListNode(sum%10);//有节点时，就将新节点放入tail的下一节点
                tail = tail.next;//并让tail指向下一节点
            }

            carry = sum/10;
            if(l1 != null){
                l1 = l1.next;//循环退出的条件，不断往后移一个
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            tail.next = new ListNode(carry);//循环外面，如果进位carry还大于0，就直接添加到链表末尾。
        }
        return head;
    }
}