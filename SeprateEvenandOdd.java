public class SeprateEvenandOdd {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4, 5 , 6 , 7 , 8, 9};
         System.out.println("Even numbers in array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();    //Adds line break after even numbers
        
        System.out.println("Odd numbers in array are: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
