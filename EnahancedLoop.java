public class EnahancedLoop {
    public static void main(String[] args) {
       
        int marks[] = new int[3];
        for(int i = 0; i<3 ; i++){
            marks[i] = 1;
        }
        
        for(int n : marks){     //Enhanced for loop (for each loop)
            System.out.println(n);
        }

    }
}