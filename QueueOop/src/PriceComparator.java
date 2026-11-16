import java.util.*;
public class PriceComparator implements Comparator<Order> {
    public int compare(Order a, Order b){
        return Double.compare(a.getPrice(), b.getPrice());
    }
}
