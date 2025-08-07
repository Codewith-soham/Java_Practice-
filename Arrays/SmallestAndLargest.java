import java.util.*;

public class SmallestAndLargest {
    public static int operation(int arr[]){
        int largest = Integer.MIN_VALUE; //Set value -infinity
        int smallest = Integer.MAX_VALUE; //Sets value infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in the arrray is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = operation(arr);
        System.out.println("Largest number in the array is: " + result);

        sc.close();
    }
}
