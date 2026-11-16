import java.util.*;

public class Main{
    public static void main(String[] args){
        List<String> names = List.of("Yersaiyn","Kuzbakov","Aza");
        Iterator<String>iterator = names.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator);

    }
}

