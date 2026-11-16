import java.io.*;
import java.util.*;
public class WriteObject {
    public static void main(String[] args){
        Person[] people = { new Person(1,"Yersaiyn"),
                new Person(2,"Daryn"),new Person(3,"Bob")};
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
            oos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
