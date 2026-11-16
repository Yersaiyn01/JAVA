//import java.util.*;
//public class Main{
//    public static void main(String args[]){
//        Set<String> set = new HashSet<>();
//        set.add("Ali");
//        set.add("Yersaiyn");
//        set.add("Ali");
//        set.add("Isa");
//        System.out.println(set);
//
//        boolean result = set.add("Yersaiyn");
//        System.out.println(result);
//        boolean result2 = set.add("Iliyas");
//        System.out.println(result2);
//        System.out.println(set);
//        if (!set.add("Yersaiyn")) {
//            System.out.println("10 already exists");
//        }
//        System.out.println("");
//        for (String name : set) {
//            System.out.println(name);
//        }
//        System.out.println("");
//        if (set.contains("Isa")) { // contains works always with boolean
//            System.out.println("Isa exists");
//        }
//
//        set.remove("Ali");
//
////        set.add(value);       // добавить
////        set.remove(value);    // удалить
////        set.contains(value);  // существует?
////        set.size();           // количество
////        set.isEmpty();        // пустой?
////        set.clear();          // удалить всё
//
//        Set<Integer> numbers = new HashSet<>();
//
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//
//        System.out.println(numbers.size());       // 3
//        System.out.println(numbers.contains(20)); // true
//
//        numbers.remove(20);
//
//        System.out.println(numbers.contains(20)); // false
//
//
//    }
//}
import java.util.*;
public class Main{
    public static void main(String args[]){
        Set<Member> member = new HashSet<>();

        Member m1 = new Member(1,"Yersaiyn","ersaim2@gmail.com");
        Member m2 = new Member(2,"Bekzat","beks933@gmail.com");
        Member m3 = new Member(3,"Isa","IsaLox@gmail.com");
        Member m4 = new Member(4, "Ali", "ali@mail.com");
        Member m5 =new Member(5, "Dias", "dias@mail.com");
        Member m6 = new Member(1, "Other Ali", "other@mail.com");

        member.add(m1);
        member.add(m2);
        member.add(m3);
        member.add(m4);
        member.add(m5);
        member.add(m6);

        int targetId = 2;
        for(Member sh : member){
            if(sh.getId() == targetId){
                System.out.println(sh);
                break;
            }

        }
        for(Member g : member){
            if(g.getEmail().contains("Isa@gmail.com")){
                System.out.println("Yes");
                break;
            }
            else{System.out.println("Not");}
        }

        int deleteId = 3;

        member.removeIf(tt -> tt.getId() == deleteId);

    }
}