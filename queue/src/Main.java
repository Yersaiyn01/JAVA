import java.util.*;
// Queue -> LinkedList = ArrayDeque = PriorityQueue
// Queue FIFO

public class Main{
    public static void main(String[] args){
    Queue<String> q1 = new LinkedList<>();
    q1.offer("Yersaiyn");
    q1.offer("Beka");
    q1.offer("Isalox");

    System.out.println(q1.peek()); // peek shows to us the first index in the array
    System.out.println(q1.poll()); // it works same like a peek but poll deletes the element which shows
    System.out.println(q1);
    System.out.println(q1.peek());
    // Queue with LinkedList null <- 10 <-> 20 <-> 30 -> null
        System.out.println("");
     Queue<Integer> queue = new ArrayDeque<>();
     queue.offer(21);
     queue.offer(43);
     queue.offer(32);
     queue.offer(13);
     System.out.println(queue.peek());
     System.out.println(queue.poll());
     System.out.println(queue);
     System.out.println("");
     //Deque -> Double Ended Queue
     Deque<Integer>dq = new ArrayDeque<>(); // This is a stack
     dq.addFirst(10);
     dq.addLast(20);
     dq.addFirst(5);
     System.out.println(dq); // [5,10,20]
     System.out.println(dq.pollFirst());
     System.out.println(dq);
     System.out.println(dq.pollLast());
     System.out.println(dq);
     System.out.println(dq.pop());
     System.out.println(dq);
     System.out.println("");

     dq.push(2);
     dq.push(3);
     dq.push(4);
     System.out.println(dq);
     System.out.println(dq.pop());
     // Queue -> FIFO//Stack -> LIFO
        System.out.println();





    }
}