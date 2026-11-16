import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Alex", 12000.0, "DONE"));
        orders.add(new Order(2, "John", 5000.0, "NEW"));
        orders.add(new Order(3, "Alex", 8000.0, "PROCESSING"));
        orders.add(new Order(4, "Max", 25000.0, "DONE"));
        orders.add(new Order(5, "John", 15000.0, "CANCELLED"));
        orders.add(new Order(6, "Alex", 7000.0, "DONE"));
        orders.add(new Order(7, "Max", 3000.0, "NEW"));
        orders.add(new Order(8, "John", 18000.0, "DONE"));

        // 1. Вывести все заказы
        System.out.println("Все заказы:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }

        // 2. Найти заказ по id
        int targetId = 3;
        boolean found = false;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == targetId) {
                System.out.println("\nНайден заказ:");
                System.out.println(orders.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Order not found");
        }

        // 3. Изменить статус заказа по id
        int idToChange = 3;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == idToChange) {
                orders.get(i).setStatus("DONE");
                break;
            }
        }

        // 4. Удалить все CANCELLED
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getStatus().equals("CANCELLED")) {
                orders.remove(i);
            }
        }

        // 5. Найти самый дорогой заказ
        Order maxOrder = orders.get(0);

        for (int i = 1; i < orders.size(); i++) {
            if (orders.get(i).getPrice() > maxOrder.getPrice()) {
                maxOrder = orders.get(i);
            }
        }

        System.out.println("\nСамый дорогой заказ:");
        System.out.println(maxOrder);

        // 6. Посчитать сумму всех DONE заказов
        double sumDone = 0;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus().equals("DONE")) {
                sumDone += orders.get(i).getPrice();
            }
        }

        System.out.println("\nСумма DONE заказов: " + sumDone);

        // 7. Создать новый список заказов дороже 10000
        ArrayList<Order> expensiveOrders = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getPrice() > 10000) {
                expensiveOrders.add(orders.get(i));
            }
        }

        System.out.println("\nЗаказы дороже 10000:");
        for (int i = 0; i < expensiveOrders.size(); i++) {
            System.out.println(expensiveOrders.get(i));
        }

        // 8. Сортировка по цене от большей к меньшей
        for (int i = 0; i < orders.size() - 1; i++) {
            for (int j = 0; j < orders.size() - 1 - i; j++) {

                if (orders.get(j).getPrice() < orders.get(j + 1).getPrice()) {

                    Order temp = orders.get(j);

                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nПосле сортировки:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }

        // 9. Найти клиента с самой большой общей суммой заказов

        ArrayList<String> customers = new ArrayList<>();
        ArrayList<Double> sums = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {

            Order order = orders.get(i);

            int customerIndex = -1;

            for (int j = 0; j < customers.size(); j++) {

                if (customers.get(j).equals(order.getCustomer())) {
                    customerIndex = j;
                    break;
                }
            }

            if (customerIndex == -1) {

                customers.add(order.getCustomer());
                sums.add(order.getPrice());

            } else {

                double oldSum = sums.get(customerIndex);
                double newSum = oldSum + order.getPrice();

                sums.set(customerIndex, newSum);
            }
        }

        // ищем максимальную сумму
        int maxIndex = 0;

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i) > sums.get(maxIndex)) {
                maxIndex = i;
            }
        }

        System.out.println("\nКлиент с самой большой суммой заказов:");
        System.out.println(customers.get(maxIndex) + " -> " + sums.get(maxIndex));
    }
}

