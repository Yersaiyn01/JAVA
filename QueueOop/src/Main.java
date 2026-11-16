import java.util.*;
public class Main{
    public static void main(String args[]){
    Queue<Order> queue  = new LinkedList<>();
    Set<Order> set = new HashSet<>();
    Map<Integer,Courier> map = new HashMap<>();

    Courier c1 = new Courier(1, "Alex", 25, 300000);
    Courier c2 = new Courier(2, "Dias", 30, 350000);
    Courier c3 = new Courier(3, "Ali", 22, 280000);
    map.put(c1.getId(), c1);
    map.put(c2.getId(), c2);
    map.put(c3.getId(), c3);

    Order o1 = new Order(1, "Laptop", 450000, 2);
    Order o2 = new Order(2, "Phone", 250000, 1);
    Order o3 = new Order(3, "Keyboard", 30000, 3);
    Order o4 = new Order(4, "Monitor", 120000, 2);
    Order o5 = new Order(5, "Mouse", 15000, 1);
    Order o6 = new Order(6, "Headphones", 50000, 3);
    Order o7 = new Order(3, "Tablet", 180000, 2);
    set.add(o1);
    set.add(o2);
    set.add(o3);
    set.add(o4);
    set.add(o5);
    set.add(o6);
    set.add(o7);

    System.out.println(set.size());

    queue.addAll(set);
    System.out.println("First: " + queue.peek());
    System.out.println("Processed: " + queue.poll());
    System.out.println("Queue size: " + queue.size());

    int serchaID = 4;
    for(Order order: queue){
        if(order.getId() == serchaID){
            System.out.println(order);
        }
    }

    double expensiveOrder = 0;
    for(Order orders: queue){
        if(orders.getPrice() > expensiveOrder){
            expensiveOrder = orders.getPrice();
        }
    }


    }
}