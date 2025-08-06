//to search string in array

import java.util.*;


public class LinearSearchString {

    public static String linearsearchstr(String array[] , String key){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return String.valueOf(i);
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array.");

        int n = sc.nextInt();
        sc.nextLine();
        
        String array[] = new String[n];

        System.out.println("Enter the elements (strings) in array.");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        System.out.println("Enter the string you want to search.");
        String key = sc.nextLine();

        String index = linearsearchstr(array, key);
        if (index == "-1") {
            System.out.println("String not found in array..");
        }else{
            System.out.println("String found at index " + index);
        }

        sc.close();
    }
}
