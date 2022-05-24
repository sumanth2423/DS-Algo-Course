package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Cycle {
 public boolean hasCycle(ListNode head) {
  Set<ListNode> hashListNode = new HashSet<ListNode>();

  while (head != null) {
   head = head.next;
   if (hashListNode.contains(head)) {
    return true;
   } else {
    hashListNode.add(head);
   }
  }
  return false;
 }

 public boolean hasCycleAlterNative(ListNode head) {
  ListNode fast = head;
  ListNode slow = head;
  while (fast != null && fast.next != null) {

   fast = fast.next.next;
   slow = slow.next;
   if (fast == slow) {
    return true;
   }
  }
  return false;
 }
}