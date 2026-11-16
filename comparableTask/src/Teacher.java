import java.util.*;
public class Teacher extends Person implements CourseManager{
    private double  salary;
    private Set<Course> course;

    public Teacher(double salary,String name, int id, int age){
        super(id,name,age);
        this.salary = salary;
        this.course = new HashSet<>();
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public Set<Course> getCourse(){
        return course;
    }

    public void addCourse(Course course){
        this.course.add(course);
    }

    public void removeCourse(int courseId) {
        Iterator<Course> it = course.iterator();
        while(it.hasNext()){
            Course current = it.next();
            if(current.getId()  == courseId){
                it.remove();
                break;
            }
        }
    }

    public String getRole(){
        return "I'm a teacher";
    }

}
