import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Queue<Integer>q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        q.offer(6);
//        q.offer(7);
//        int k = 3;
//        int i = 1;
//        while(q.size() > 1){
//            if(k == i){
//                q.poll();
//                i = 1;
//            }
//            q.offer(q.poll());
//            i++;
//        }
//        System.out.println(q.peek());
//
//    }
//}
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        Queue<String> q = new LinkedList<>();
//
//        q.offer("1");
//
//        for (int i = 0; i < n; i++) {
//
//            String current = q.poll();
//
//            System.out.println(current);
//
//            q.offer(current + "0");
//            q.offer(current + "1");
//        }
//    }
//}
import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            int number = sc.nextInt();

            q.offer(number);

            if (q.size() > k) {
                q.poll();
            }

            int sum = 0;

            for (int value : q) {
                sum += value;
            }

            double average = (double) sum / q.size();

            System.out.println(average);
        }
    }
}