package LinkedList;

public class RemoveElement {

 public ListNode removeElements(ListNode head, int val) {

  ListNode sentinal = new ListNode(0);
  sentinal.next = head;

  ListNode previousNode = sentinal;
  ListNode currentNode = head;

  while (currentNode != null) {

   if (currentNode.value == val) {
    previousNode.next = currentNode.next;
   } else {
    previousNode = currentNode;
   }

   currentNode = currentNode.next;

  }
  return sentinal.next;
 }

}
