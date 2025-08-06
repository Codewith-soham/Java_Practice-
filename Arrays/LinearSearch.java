//Linear Search algorithim

import java.util.*;

public class LinearSearch {
    public static int linearSrch(int array[], int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; //if not found 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

       
        int array[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();

        int index = linearSrch(array , key);

        if(index == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("Element found at index " + index);
        }

        sc.close();
    }
}
