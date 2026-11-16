import java.util.*;
public class Main{
    public static void main(String args[]){
    Map<Integer,Person> p = new HashMap<>();
    Set<Student> students = new HashSet<>();

    Student s1 = new Student(1, "Yersaiyn", 19, 3.4);
    Student s2 = new Student(2, "Isa", 21, 3.7);
    Student s3 = new Student(3, "Iliyas", 20, 3.5);

    Teacher t1 = new Teacher(10, "Alex", 35, 500000);
    Teacher t2 = new Teacher(11, "John", 42, 650000);

    Course c1 = new Course(101, "Java", 5);
    Course c2 = new Course(102, "Database", 4);
    Course c3 = new Course(103, "Algorithms", 5);

    students.add(s1);
    students.add(s2);
    students.add(s3);

    p.put(s1.getId(), s1);
    p.put(s2.getId(), s2);
    p.put(s3.getId(), s3);
    p.put(t1.getId(), t1);
    p.put(t2.getId(), t2);

    int targetId = 2;
    for(Map.Entry<Integer,Person>entry: p.entrySet()){
        if(entry.getValue().getId() == targetId){
            System.out.println(entry.getValue());
            break;
        }
    }

        for(Map.Entry<Integer,Person>entry2: p.entrySet()){
            if(entry2.getValue() instanceof Student){
                System.out.println(entry2.getValue());
            }
        }


        for(Student s: students){
            if(s.getGpa() > 3.5){
                System.out.println(s);
            }
        }

        List<Student> list = new ArrayList<>(students);

        list.sort(new GpaComparator());

        for (Student s : list) {
            System.out.println(s);
        }



    }
}