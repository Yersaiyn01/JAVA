public class Course {
    private int id;
    private String name;
    private int credit;

    public Course(int id,String name,int credit){
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCredit(){
        return credit;
    }

    public String toString(){
        return id +" "+ name +" "+ credit;
    }
}
