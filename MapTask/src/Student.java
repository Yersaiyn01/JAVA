import java.util.*;
public class Student {
    private int id;
    private String name;
    private double gpa;
    private List<Course> courses;

    public Student(int id,String name,double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }

}
