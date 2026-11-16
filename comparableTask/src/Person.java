public abstract class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract String getRole();

    public String toString(){
        return id +" "+ name+" " + age;
    }

}
