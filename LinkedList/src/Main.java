import java.util.*;
// key -> value
// Ali -> 20
// Map<String,Integer>students = new Hashmap<>():
// Map<String,Integer>students = new LinkedHashMap<>();
//Map<String,Integer> students = new TreeMap<>();
// String = тип ключа, Integer = тип значение
public class Main{
    public static void main(String[] args){
        Map<Integer,Student> map = new HashMap<>();
        Student student1 = new Student(1,"Yersaiyn",19,3.30);
        Student student2 = new Student(2,"IIsa",21,3.40);
        Student student3 = new Student(3,"Iliyas",19,3.34);
        Student student4 = new Student(4,"Oreke",19,3.67);
        Student student5 = new Student(5,"Rauan",19,3.43);
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.put(student4.getId(), student4);
        map.put(student5.getId(), student5);

        // task 1
        int targetId = 3;
        if(map.containsKey(targetId)){
            System.out.println(map.get(targetId));
        }
        else{
            System.out.println("Nothing found!!!");
        }

        // taks 2
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            if(entry.getValue().getGpa() > 3.00){
                System.out.println(entry.getValue().getGpa());
            }
        }


    }
}