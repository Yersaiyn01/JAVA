public class Course {
    private int id;
    private String name;
    private int credits;

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }
    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getCredits(){
        return credits;
    }

    // toString
    public String toString() {
        return "id: " + id + " name: " + name + " credits: " + credits;
    }

    // equals
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Course)){ return false;}

        Course other = (Course) obj;

        return this.id == other.id;
    }

    // hashcode

    public int hashCode(){
        return Integer.hashCode(id);
    }

}
