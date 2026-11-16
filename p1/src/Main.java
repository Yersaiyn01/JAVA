import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        System.out.println("Enter grades:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= 50) {
                System.out.println(arr[i] + " passed");
            } else {
                System.out.println(arr[i] + " failed");
            }

            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);
        System.out.println("Average grade: " + avg);
    }
}