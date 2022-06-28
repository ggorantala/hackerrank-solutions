//package hackerrank.thirtydaysofcode;
//
//import java.util.Scanner;
//
//public class LinkedListCreate {
//  private static final Scanner sc = new Scanner(System.in);
//
//  public static void main(String[] args) {
//    LinkedList list = new LinkedList();
//    LinkedList.insert(10);
//    LinkedList.insert(20);
//    System.out.println(list);
//
//    sc.close();
//  }
//}
//
//class Node {
//  int data;
//  Node next;
//
//  public Node(int data) {
//    this.data = data;
//  }
//
//  @Override
//  public String toString() {
//    return "ListNode{" + "data=" + data + ", next=" + next + '}';
//  }
//}
//
//class LinkedList {
//  private Node head;
//  private int length;
//
//  public static Node insert(Node head, int data) {
//    // Complete this method
//    if (head == null) return new Node(data);
//    else if (head.next == null) {
//      head.next = new Node(data);
//    } else {
//      insert(head.next, data);
//    }
//
//    return head;
//  }
//
//  @Override
//  public String toString() {
//    return "LinkedList{" + "head=" + head + ", length=" + length + '}';
//  }
//}
