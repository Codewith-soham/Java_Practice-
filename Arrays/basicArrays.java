import java.util.*;

public class basicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int marks[] = new int[10]; //array declaration

        marks[0] = sc.nextInt();    //taking input in 0 index of array
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Output of the code is ");
        System.out.println(marks[0]); //Printing marks at index 0 of array
        System.out.println(marks[1]);  //Printing marks at index 1 of array
        System.out.println(marks[2]);
        marks[2] = marks[2] + 1;  //Performing operation on value at index 2 by adding 1 in it 

        System.out.println("Updated value of value at index 2");
        System.out.println(marks[2]);
        
        sc.close();
    }
}
