import java.util.*;

class searchxtwoD{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int coloums = sc.nextInt();
        int[][] numbers = new int[rows][coloums];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloums; j++) {
                numbers[i][j] = sc.nextInt();
            }
            
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloums; j++) {
                if (numbers[i][j] == 20) {
                    System.out.print(i + j + " is the row and coloumn");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}