import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        System.out.println("After block try catch");
    }

    public static void readFile() throws FileNotFoundException {

        File file = new File("test");
        Scanner scan = new Scanner(file);

    }
}