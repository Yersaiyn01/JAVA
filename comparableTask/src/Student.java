import java.util.*;
public class Student extends Person implements CourseManager , Comparable<Student> {
    private double gpa;
    private Set<Course> course;

    public Student(int id, String name, int age,double gpa) {
        super(id,name,age);
        this.gpa = gpa;
        this.course = new HashSet<>();
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }

    public Set<Course> getCourse() {
        return course;
    }

    // addCourse
    public void addCourse(Course course){
        this.course.add(course);
    }
    // removeId
    @Override
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

    public String getRole() {
        return "Student";
    }

    // compareTo
    public int compareTo(Student other){
        return Integer.compare(this.getId(),other.getId());
    }


}
