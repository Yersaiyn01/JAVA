import java.util.*;
public class Main{
    public static void main(String args[]){
    Map<Integer,Student> students = new HashMap<>();
    Student s1 = new Student(1,"Yersaiyn",3.33);
    Student s2 = new Student(2,"Isa",3.57);
    Student s3 = new Student(3,"Iliyas",3.54);
    Student s4 = new Student(4,"Rauan",3.34);
    Student s5 = new Student(5,"Farhat",2.43);

    students.put(s1.getId(),s1);
    students.put(s2.getId(),s2);
    students.put(s3.getId(),s3);
    students.put(s4.getId(),s4);
    students.put(s5.getId(),s5);

    Course c1 = new Course(1,"Math",3);
    Course c2 = new Course(2,"Java",5);
    Course c3 = new Course(3,"Database",5);

    s1.addCourse(c1);
    s1.addCourse(c2);

    s2.addCourse(c2);
    s2.addCourse(c3);

    s3.addCourse(c1);
    s3.addCourse(c2);
    s3.addCourse(c3);

    s4.addCourse(c1);
    s4.addCourse(c3);

    s5.addCourse(c1);

    int targetId = 3;

    for(Map.Entry<Integer,Student> entry: students.entrySet()){
        if(entry.getKey() == targetId){
            System.out.println(entry.getValue());
        }
    }

    System.out.println();

    for(Map.Entry<Integer,Student>entry: students.entrySet()){
        if(entry.getValue().getGpa() > 3.00){
            System.out.println(entry.getValue());
        }
    }

        for(Map.Entry<Integer,Student>entry: students.entrySet()){
            if(entry.getValue().getCourses().stream().count() > 1){
                System.out.println(entry.getValue());
            }
        }



    }
}