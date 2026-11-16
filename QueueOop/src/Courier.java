public class Courier extends Person implements Worker {
    private double salary;
    public Courier(int id,String name,int age,double salary){
        super(id,name,age);
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getRole(){
        return "Courier";
    }
    public void work(){
        System.out.println(getName() + ": is delivering orders");
    }

}
