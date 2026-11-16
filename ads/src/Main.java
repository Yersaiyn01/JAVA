import java.util.*;
//
//public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                String s = sc.next();
//                String s2 = sc.next();
//
//                Deque<Character> stack1 = new ArrayDeque<>();
//                Deque<Character> stack2 = new ArrayDeque<>();
//
//                for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (ch == '#') {
//                if (!stack1.isEmpty()) {
//                    stack1.pop();
//                }
//            } else {
//                stack1.push(ch);
//            }
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//            char ch = s2.charAt(i);
//
//            if (ch == '#') {
//                if (!stack2.isEmpty()) {
//                    stack2.pop();
//                }
//            } else {
//                stack2.push(ch);
//            }
//        }
//
//        if (stack1.equals(stack2)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}
//
//
//public class Main{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        Deque<Character>stack = new ArrayDeque<>();
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(!stack.isEmpty() && ch == stack.peek()){
//                stack.pop();
//            }
//            else{
//                stack.push(ch);
//            }
//        }
//        if(!stack.isEmpty()){
//            System.out.println("Not Balanced");
//        }
//        else{
//            System.out.println("Balanced");
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static boolean prime(int x) {
//        if (x < 2) {
//            return false;
//        }
//        for (int i = 2; i <= x / i; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int count = 0;
//        int m = 0;
//
//        for (int x = 2; ; x++) {
//            if (prime(x)) {
//                count++;
//
//                if (prime(count)) {
//                    m++;
//
//                    if (m == n) {
//                        System.out.println(x);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}