import java.util.*;
public class Main{
    public static void main(String args[]){
    Set<User> user = new HashSet<>();
    User u1 = new User(1, "yers", "yers@mail.com", 19);
    User u2 = new User(2, "isa", "isa@mail.com", 21);
    User u3 = new User(3, "ilyas", "ilyas@mail.com", 20);
    User u4 = new User(4, "rauan", "rauan@mail.com", 43);
    User u5 = new User(5, "farhat", "farhat@mail.com", 22);
    User u6 = new User(6, "bek", "bek@mail.com", 23);

    User u7 = new User(1, "another", "another@mail.com", 30);
    user.add(u1);
    user.add(u2);
    user.add(u3);
    user.add(u4);
    user.add(u5);
    user.add(u6);
    user.add(u7);
    boolean added = user.add(u7);
    System.out.println(added);

    for(User s1:user){
        if(s1.getId() == 3){System.out.println(s1);}
    }

    for(User s2:user){
            if(s2.getAge() > 20){System.out.println(s2);}
    }
    int max = 0;
    for(User s3 : user){
        if(s3.getAge() > max){
            max = s3.getAge();
        }
    }
    for(User s4: user){
        if(s4.getAge() == max){System.out.println(s4);}
    }

    int deleteId = 3;
    Iterator<User> it1 = user.iterator();

    while(it1.hasNext()){
        User current = it1.next();

        if(current.getId() == deleteId){
            it1.remove();
            break;
        }
    }

    User x1 = new User(2, "Other Isa", "otherisa@mail.com", 25);
    User x2 = new User(4, "Other Rauan", "otherrauan@mail.com", 30);
    User x3 = new User(10, "Alex", "alex@mail.com", 20);
    User x4 = new User(11, "John", "john@mail.com", 28);
    System.out.println();
    Set<User> users2 = new HashSet<>(Set.of(x1,x2,x3,x4));
    for(User s1: user){
        for(User s2 : users2){
            if(s1.equals(s2)){System.out.println(s1);}
        }
    }
        Set<User> common = new HashSet<>(user);

        common.retainAll(users2);

        System.out.println(common);

        common.removeAll(users2);
        System.out.println(common);

        common.addAll(users2);
        System.out.println(common);
    }
}

//A.addAll(B)     → A ∪ B
//A.retainAll(B)  → A ∩ B
//A.removeAll(B)  → A - B