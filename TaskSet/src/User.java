class User{
    private int id;
    private String name;
    private String email;
    private int age;
    public User(int id,String name,String email,int age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    // setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // getter
    public int getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public int getAge(){return age;}
    //toString
    public String toString(){
        return "id: " + id
                +" name: " +name
                +" email " + email
                +" age " + age;
    }
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(!(obj instanceof User)) {return false;}
            User other = (User) obj;
        return this.id == other.id;
    }

    public int hashCode(){
        return Integer.hashCode(id);
    }


}