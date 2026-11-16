import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws ScannerException{
        Scanner sc = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(sc.nextLine());

            if(x != 0){
                throw new ScannerException("User wrote number except  zero");
            }
        }


    }
}