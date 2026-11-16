//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int max = Integer.MIN_VALUE;
//        int max2 =  Integer.MIN_VALUE;
//        int max3 =  Integer.MIN_VALUE;
//        int[] arr = new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//            if(arr[i] > max){
//                max3 = max2;
//                max2 = max;
//                max = arr[i];
//            }
//            else if(arr[i] > max2 && arr[i] == max){
//                max3 = max2;
//                max2 = arr[i];
//            }
//            else if(arr[i] > max3 && arr[i] == max){
//                max3 = arr[i];
//            }
//        }
//        System.out.println(max*max2*max3);
//    }
//}
//class Main{
//    public int even(int[] a){
//        int count = 0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,6};
//        Main obj = new Main();
//        int result = obj.even(arr);
//        System.out.print(result);
//    }
//}

// public class Main{
//    public int countPositive(int[] nums){
//            int count =0;
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]>0){
//                    count++;
//                }
//            }
//            return count;
//    }
//    public static void main(String[] args){
//        int[] arr = {-5, 10, -3, 8, 0, 15};
//        Main obj = new Main();
//        int result = obj.countPositive(arr);
//        System.out.println(result);
//
//    }
//
//}

