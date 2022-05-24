package LinkedList;

public class Demo {

 public static void main(String[] args) {

  MyLinkedList list = new MyLinkedList();
  list.addAtHead(1);
  list.addAtHead(2);
  list.addAtHead(3);

  System.out.println(list.get(1));
 }

}
