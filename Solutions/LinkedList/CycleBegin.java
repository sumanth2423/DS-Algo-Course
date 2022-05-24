package LinkedList;

import java.util.*;

//Give head of a linked list, return the node where the cycle begins
public class CycleBegin {
 public ListNode detectCycle(ListNode head) {

  Map<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
  int counter = 0;
  while (head != null) {

   if (hashMap.containsKey(head)) {
    // This is start of cycle.
    return head;
   } else {
    hashMap.put(head, counter++);
   }

   head = head.next;
  }

  return null;
 }

}
