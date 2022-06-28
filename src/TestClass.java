import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TestClass {

  public static void main(String[] args) {
    Queue<Integer> deque = new ArrayDeque<>();

    for(int i = 0; i <= 10; i++) {
      deque.add(i);
    }

//    System.out.println(deque.poll()); // removes first element
//    System.out.println(deque.peek()); // just looks at first element
//    System.out.println(deque.pollFirst()); // same as poll, removes first el
//    System.out.println(deque.pollLast()); // removes last el
//    System.out.println(deque.peekFirst()); // take a look at first el
//    System.out.println(deque.peekLast()); // takes a look at last el
//    System.out.println(deque.pop()); // removes first el

    System.out.println(deque);
  }
}
