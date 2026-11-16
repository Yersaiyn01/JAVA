import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
// public class Main{
//    public static void main(String[] args){
//        int[] arr = {54,67,99,34,54};
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        int count = 0 ;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == target){
//                System.out.println(i);
//                count++;
//            }        }
//        if(count == 0){
//            System.out.println("In this array doesn't have elemet that you look for or search");
//        }
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase().replace(" ","");
//        String reversed = new StringBuilder(s).reverse().toString().toLowerCase().replace(" ","");
//        if(s.equals(reversed)){System.out.println("palindrom");}
//        else{System.out.println("thats not a palindrom");}
//
//
//
//
//    }}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase().replace(" ","");
//        StringBuilder st = new StringBuilder(s);
//        int count = 0;
//
//        for(int i=0;i <st.length() ;i++){
//            char c = s.charAt(i);
//            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'y'){
//                count++;
//            }
//
//            }
//        System.out.println(count);
//
//        }
//
//    }
import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase().replace(" ", "");
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//
//        System.out.println(map);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String[] arr = {"java", "spring", "sql", "git"};
//        int count1 = arr[0].length();
//        int count2 = 0;
//        for(int i=0;i<arr.length;i++){
//            count2 = arr[i].length();
//            if(count1 < count2){
//                count1 = count2;
//            }
//        }
//        System.out.println(count1);
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int[] arr = {1,5,3,4,2};
//        int count = 0 ;
//        int num = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(num < arr[i]){
//                count++;
//                num = arr[i];
//            }
//        }
//        if(count+1 == arr.length){
//            System.out.println(true);
//        }
//        else{System.out.println(false);}
//
//    }}

//public class Main{
//    public static void main(String[] args){
//        int[] arr = {54,67,99,34,54,233};
//        int max = arr[0];
//        int min = arr[0];
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//
//    }}

//public class Main{
//    public static void main(String[] args){
//        int[] arr = {1,2,2,3,3,3,4,5,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i =0 ;i< arr.length;i++){
//            set.add(arr[i]);
//        }
//        System.out.println(set.size());
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,2,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i =0 ;i<arr.length;i++){
//            if(set.contains(arr[i])){
//                System.out.println(arr[i]);
//                break;
//            }
//            set.add(arr[i]);
//        }
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int count = 0;
//        for(int i=0;i<s.length();i++){
//        char ch = s.charAt(i);
//        if(Character.isUpperCase(ch)){count++;}
//    }
//        System.out.println(count);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int count = 0;
//        String[] word = s.split(" ");
//        for(int i=0;i<word.length;i++){
//            if(word[i].length()> 2){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        for(int i = 0;i< s.length();i++){
//            char ch = s.charAt(i);
//            if(ch == 'a' || ch == 'e' ||  ch == 'y' ||  ch == 'u' ||  ch == 'i' ||  ch == 'o'){
//                continue;
//            }
//            else{
//                char ll = ch;
//                System.out.print(ll);
//            }
//        }
//    }}

//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase();
//        int count_max = 0;
//        for(int i=0;i< s.length();i++){
//            int count =0;
//            for(int j = 0;j<s.length();j++){
//                char ch1 = s.charAt(i);
//                char ch2 = s.charAt(j);
//                if(ch2 == ch1){
//                    count++;
//                }
//            }
//            if(count > count_max){
//                count_max = count;
//
//            }
//        }
//        System.out.println(count_max);
//
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        int[] arr = {5, 2, 8, 1, 3};
//        int min = Integer.MAX_VALUE;
//        int second_min = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                second_min = min;
//                min = arr[i];
//            }
//            else if (arr[i] < second_min && arr[i]!=min){
//                second_min = arr[i];
//            }
//        }
//
//        System.out.println(second_min);
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int count =0;
//        for(int i=0;i< s.length();i++){
//            for(int j =i+1;j<s.length();j++){
//                char ch = s.charAt(i);
//                char ch2 = s.charAt(j);
//                if(ch == ch2){
//                    count++;
//                }
//            }
//        }
//        if(count > 0) {
//        System.out.println(false);
//        }
//        else {System.out.println(true);}
//
//        }
//    }

//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().replace(" ","").toString();
//        StringBuilder sb = new StringBuilder(s).reverse();
//        int count = 0;
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            char ch2 = sb.charAt(i);
//            if(ch == ch2){count++;}
//        }
//        if(count == s.length()){System.out.println("Our string is pallindrom");}
//        else{System.out.println("Our String is not a pallindrom");}
//
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().replace(" ","").toString();
//        int left = 0;
//        int right = s.length()-1;
//        while(left < right){
//            if(s.charAt(left) != s.charAt(right)){
//                System.out.println(false);
//                return;
//            }
//            left++;
//            right--;
//        }
//        System.out.println(true);
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().replace(" ","").toString();
//        int left = 0;
//        int right = s.length()-1;
//        while(left < right){
//            System.out.print(s.charAt(right));
//            left++;
//            right--;
//        }
//
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toString();
//        String[] words = s.split(" ");
//        String longest = words[0];
//        String Seecond_longest = words[0];
//        for(int i=0;i<words.length;i++){
//            if(words[i].length() > longest.length()){
//                Seecond_longest = longest;
//                longest = words[i];
//            }
//            else if(words[i].length() > Seecond_longest.length() && words[i].length()!=longest.length()){
//                Seecond_longest = words[i];
//            }
//        }
//        System.out.print(Seecond_longest);
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] words= s.split(" ");
//        int sum = 0;
//        int count = 0;
//        for(int i=0;i<words.length;i++){
//            sum+= words[i].length();
//        }
//        int avr = sum/words.length;
//        for(int i =0;i< words.length;i++ ){
//            if(words[i].length() > avr){System.out.println(words[i]);
//            count++;}
//        }
//        System.out.print(count);
//
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int index = 0;
//        int max =  Integer.MIN_VALUE;;
//        for(int i =0;i< arr.length;i++){
//             arr[i] = sc.nextInt();
//             if(arr[i] > max){
//                 max = arr[i];
//                 index = i;
//             }
//        }
//        System.out.println(max);
//        System.out.println(index);
//
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Scanner sc public class Main{
//            public static void main(String[] args){
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int[] arr = new int[n];
//                for(int i = arr.length - 1; i >= 0; i--){
//                    arr[i] = sc.nextInt();
//                    System.out.print(arr[i] + " ");
//                }
//
//
//            }
//        }= new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = arr.length - 1; i >= 0; i--){
//            arr[i] = sc.nextInt();
//            System.out.print(arr[i] + " ");
//        }
//
//
//    }
//}
//class Main{
//    public int indexOfMaxNumber(int[] num){
//        int max = num[0];
//        int maxIndex = 0;
//        for(int i =1 ;i<num.length;i++){
//            if(num[i]>max){ max = num[i];maxIndex = i; }
//        }
//        return maxIndex;
//    }
//
//}
//class Main{
//    public int secondMaxNumber(int[] num){
//        int max = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        for(int i=0;i<num.length;i++){
//            if(num[i] > max){ max2 = max; max = num[i];}
//            else if(num[i]> max2 && num[i]!=max){max2 = num[i];}
//        }
//        return max2;
//    }
//}
//class Main{
//    public boolean checkDuplicate(int[] num){
//        for(int i=0;i<num.length;i++){
//            for(int j = i+1;j < num.length;j++){
//                if(num[i] == num[j]){return true;}
//            }
//        }
//        return false;
//    }
//}
//class Main{
//    public boolean isSosrt(int[] num){
//        int count = 0;
//        for(int i =0 ;i< num.length-1;i++){
//            if(num[i] > num[i+1]){return false;}
//        }
//        return true;
//    }
//}
//class Main{
//    public int countIndexNum(int[] num , int target){
//        int count = 0;
//        for(int i =0 ; i< num.length ;i++){
//            if(num[i] == target){count++;}
//        }
//        return count;
//    }
//}
//class Main{
//    public int firstPositiveInteger(int[] num) {
//        int positive = -1;
//        for(int i = 0;i<num.length;i++){
//            if(num[i]>0 && num[i]!=0){positive= i; break;}
//        }
//        return positive;
//    }
//    public static void main(String[] args){
//        Main obj = new Main();
//    }
//}
//class Main{
//    public int countPositive(int[] num){
//        int sum = 0;
//        for(int i =0 ;i< num.length ;i++){
//            if(num[i] > 0){sum+=num[i];}
//        }
//        return sum;
//    }
//}
//class Main{
//    public int findLastIndex(int[] num,int target){
//        int index = -1;
//        for(int i =0;i<num.length;i++){
//            if(num[i]== target){ index = i;}
//        }
//        return index;
//
//    }
//}
//class Main{
//    public int[] Arraylist(int[] num){
//        int j =0;
//        int[] list = new int[num.length];
//        for(int i =num.length-1;i>=0;i--){
//            list[j] =num[i];
//            j++;
//        }
//        return list;
//    }
//    }
//public class Main{
//    public int countGreaterThanAverage(int[] nums){
//        int sum = 0;
//        int count = 0;
//        for(int i =0 ;i < nums.length ;i++){
//            sum += nums[i];
//        }
//        double avr = (double)sum/nums.length;
//        for(int i =0;i< nums.length;i++){
//            if(nums[i] > avr){
//                count++;
//            }
//        }
//        return count;
//    }
//}
//public class Main{
//    public char mostFrequentNumber(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//        char result = s.charAt(0);
//        int maxCount = 0;
//        for(int i =0;i < s.length();i++){
//            char ch = s.charAt(i);
//
//            if(map.containsKey(ch)){map.put(ch,map.get(ch)+1);
//            }else{map.put(ch,1);
//            }
//        }
//        for(Character key: map.keySet()){
//            map.get(key);
//            maxCount = map.get(key);
//            result = key;
//        }
//        return result;
//
//    }
//}
//
//public class Main{
//    public int countDistinctChars(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//        char result = s.charAt(0);
//        int count = 0;
//        for(int i= 0; i < s.length();i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){map.put(ch,map.get(ch)+1);}
//            else{map.put(ch,1); count++;}
//        }
//       return count;
//    }
//}

//public class Main{
//    public char FirstRepeatedChat(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//        int count = 0;
//        char ggh = s.charAt(0);
//        for(int i = 0 ; i<s.length();i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){map.put(ch,map.get(ch)+1);break;}
//        }
//    }
//}
//public class Main {
//    public int countOdd(int[] odd){
//        int count = 0;
//        for(int i = 2;i<odd.length;i++){
//            if(odd[i] % 2 != 0){
//                count++;
//            }
//        }
//        return count;
//    }
//
//}
