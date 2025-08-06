//Updating array using call by method

public class UpdateArray {

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {90, 97 , 98};

        update(marks);

        System.out.println("Marks after getting updated: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
